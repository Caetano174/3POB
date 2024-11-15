import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(scanner.nextInt());
        }

        ArrayList<Integer> crescente = new ArrayList<>(numeros);
        Collections.sort(crescente);

        ArrayList<Integer> decrescente = new ArrayList<>(numeros);
        decrescente.sort(Collections.reverseOrder());

        System.out.println("Números em ordem crescente: " + crescente);
        System.out.println("Números em ordem decrescente: " + decrescente);

        scanner.close();
    }
}
