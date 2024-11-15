import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite os números inteiros. Digite 0 para encerrar.");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            if (numero == 0) break;

            if (numero > maior) maior = numero;
        }

        System.out.println("O maior número digitado foi: " + maior);

        scanner.close();
    }
}
