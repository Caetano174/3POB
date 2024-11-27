package controller;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    private List<Funcionario> funcionarios; // Lista temporária de funcionários
    private final String FILE_PATH = "funcionarios.txt"; // Caminho do arquivo

    public FuncionarioController() {
        this.funcionarios = new ArrayList<>();
        carregarDados(); // Carrega os dados do arquivo ao iniciar
    }

    // Adicionar funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarFuncionarioNoArquivo(funcionario); // Adiciona a nova linha no arquivo
    }

    // Listar todos os funcionários
    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    // Atualizar dados de um funcionário
    public boolean atualizarFuncionario(String nome, String novoNome, double novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                f.setNome(novoNome);
                f.setSalario(novoSalario);
                salvarTodosNoArquivo(); // Reescreve todo o arquivo com as alterações
                return true;
            }
        }
        return false; // Funcionário não encontrado
    }

    // Excluir funcionário
    public boolean excluirFuncionario(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                funcionarios.remove(f);
                salvarTodosNoArquivo(); // Reescreve todo o arquivo após a exclusão
                return true;
            }
        }
        return false; // Funcionário não encontrado
    }

    // Salvar todos os funcionários no arquivo (reescrever)
    private void salvarTodosNoArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Funcionario f : funcionarios) {
                writer.write(formatarFuncionarioParaArquivo(f));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados no arquivo: " + e.getMessage());
        }
    }

    // Salvar um único funcionário no arquivo (adicionar linha)
    private void salvarFuncionarioNoArquivo(Funcionario funcionario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(formatarFuncionarioParaArquivo(funcionario));
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o funcionário no arquivo: " + e.getMessage());
        }
    }

    // Formatar os dados de um funcionário para salvar no arquivo
    private String formatarFuncionarioParaArquivo(Funcionario funcionario) {
        String tipo = funcionario.getClass().getSimpleName(); // Nome da classe como tipo
        return funcionario.getId() + ";" + tipo + ";" + funcionario.getNome() + ";" + funcionario.getSalario();
    }

    // Carregar os dados do arquivo
    private void carregarDados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Funcionario funcionario = criarFuncionarioAPartirDaLinha(linha);
                if (funcionario != null) {
                    funcionarios.add(funcionario);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Criando um novo...");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados do arquivo: " + e.getMessage());
        }
    }

    // Criar um funcionário a partir de uma linha do arquivo
    private Funcionario criarFuncionarioAPartirDaLinha(String linha) {
        String[] dados = linha.split(";");
        if (dados.length != 4) {
            return null; // Linha inválida
        }

        int id = Integer.parseInt(dados[0]);
        String tipo = dados[1];
        String nome = dados[2];
        double salario = Double.parseDouble(dados[3]);

        return switch (tipo) {
            case "Desenvolvedor" -> new Desenvolvedor(id, nome, salario);
            case "Gerente" -> new Gerente(id, nome, salario);
            case "Treinador" -> new Treinador(id, nome, salario);
            case "GerenteDesenvolvedor" -> new GerenteDesenvolvedor(id, nome, salario);
            default -> null; // Tipo desconhecido
        };
    }
}
