import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            alturas.add(scanner.nextDouble());
            scanner.nextLine(); // Consumir o enter
        }

        System.out.println("Pessoas com mais de 1,70m:");
        for (int i = 0; i < 50; i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i) + "m");
            }
        }

        scanner.close();
    }
}
