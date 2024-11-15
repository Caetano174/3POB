import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, pares = 0, impares = 0;

        System.out.println("Digite os números. Digite 0 para encerrar.");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            if (numero == 0) break;

            total++;
            if (numero % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Total de números digitados: " + total);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
