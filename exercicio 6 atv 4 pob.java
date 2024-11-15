import java.util.ArrayList;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int negativos = 0, positivos = 0, nulos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numero < 0) negativos++;
            else if (numero > 0) positivos++;
            else nulos++;
        }

        System.out.println("Números negativos: " + negativos);
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números nulos: " + nulos);

        scanner.close();
    }
}
