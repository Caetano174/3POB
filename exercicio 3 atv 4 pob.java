import java.util.ArrayList;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o código da pessoa " + i + ": ");
            codigos.add(scanner.nextInt());
            scanner.nextLine(); // Consumir o enter
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite o telefone da pessoa " + i + ": ");
            telefones.add(scanner.nextLine());
        }

        while (true) {
            System.out.print("\nDigite o código da pessoa para consulta (ou -1 para sair): ");
            int codigo = scanner.nextInt();
            if (codigo == -1) break;

            int index = codigos.indexOf(codigo);
            if (index != -1) {
                System.out.println("Nome: " + nomes.get(index) + ", Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }
        }

        scanner.close();
    }
}
