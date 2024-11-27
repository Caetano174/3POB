package view;

import controller.FuncionarioController;
import model.*;

import java.util.Scanner;

public class FuncionarioView {

    private FuncionarioController controller;
    private Scanner scanner;

    public FuncionarioView() {
        this.controller = new FuncionarioController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Funcionários ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> excluirFuncionario();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    private void cadastrarFuncionario() {
        System.out.println("\n--- Cadastrar Funcionário ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer

        System.out.println("Tipo de Funcionário (1-Desenvolvedor, 2-Gerente, 3-Treinador, 4-Gerente Desenvolvedor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        Funcionario funcionario = switch (tipo) {
            case 1 -> new Desenvolvedor(nome, salario);
            case 2 -> new Gerente(nome, salario);
            case 3 -> new Treinador(nome, salario);
            case 4 -> new GerenteDesenvolvedor(nome, salario);
            default -> null;
        };

        if (funcionario != null) {
            controller.adicionarFuncionario(funcionario);
            System.out.println("Funcionário cadastrado com sucesso!");
        } else {
            System.out.println("Tipo de funcionário inválido.");
        }
    }

    private void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario f : controller.listarFuncionarios()) {
            System.out.println(f.mostrarDetalhes());
        }
    }

    private void atualizarFuncionario() {
        System.out.println("\n--- Atualizar Funcionário ---");
        System.out.print("Nome do funcionário a ser atualizado: ");
        String nome = scanner.nextLine();
        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Novo salário: ");
        double novoSalario = scanner.nextDouble();

        if (controller.atualizarFuncionario(nome, novoNome, novoSalario)) {
            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void excluirFuncionario() {
        System.out.println("\n--- Excluir Funcionário ---");
        System.out.print("Nome do funcionário a ser excluído: ");
        String nome = scanner.nextLine();

        if (controller.excluirFuncionario(nome)) {
            System.out.println("Funcionário excluído com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
