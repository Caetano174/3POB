import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        double media = soma / 10.0;
        System.out.println("Média das idades: " + media);

        scanner.close();
    }
}
