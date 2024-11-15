import java.util.ArrayList;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int maior = Integer.MIN_VALUE, frequencia = 0;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(scanner.nextInt());
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
                frequencia = 1;
            } else if (numeros.get(i) == maior) {
                frequencia++;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Frequência: " + frequencia);
        System.out.print("Posições: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == maior) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
