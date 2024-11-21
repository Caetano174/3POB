import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1. Incluir Paciente");
            System.out.println("2. Alterar Paciente");
            System.out.println("3. Excluir Paciente");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    incluirPaciente(pacientes, scanner);
                    break;
                case 2:
                    alterarPaciente(pacientes, scanner);
                    break;
                case 3:
                    excluirPaciente(pacientes, scanner);
                    break;
                case 4:
                    listarPacientes(pacientes);
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void incluirPaciente(ArrayList<Paciente> pacientes, Scanner scanner) {
        System.out.print("Número do paciente: ");
        int numero = scanner.nextInt();
        System.out.print("Peso do paciente (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Altura do paciente (m): ");
        double altura = scanner.nextDouble();

        Paciente paciente = new Paciente(numero, peso, altura);
        pacientes.add(paciente);
        System.out.println("Paciente incluído com sucesso!");
    }

    private static void alterarPaciente(ArrayList<Paciente> pacientes, Scanner scanner) {
        System.out.print("Número do paciente a alterar: ");
        int numero = scanner.nextInt();

        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                System.out.print("Novo peso (kg): ");
                double novoPeso = scanner.nextDouble();
                System.out.print("Nova altura (m): ");
                double novaAltura = scanner.nextDouble();

                paciente.setPeso(novoPeso);
                paciente.setAltura(novaAltura);
                System.out.println("Paciente alterado com sucesso!");
                return;
            }
        }

        System.out.println("Paciente não encontrado!");
    }

    private static void excluirPaciente(ArrayList<Paciente> pacientes, Scanner scanner) {
        System.out.print("Número do paciente a excluir: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNumero() == numero) {
                pacientes.remove(i);
                System.out.println("Paciente excluído com sucesso!");
                return;
            }
        }

        System.out.println("Paciente não encontrado!");
    }

    private static void listarPacientes(ArrayList<Paciente> pacientes) {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("\n--- Lista de Pacientes ---");
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
            }
        }
    }
}
