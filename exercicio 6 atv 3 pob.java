import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, menores18 = 0, maioresOuIguais18 = 0;

        System.out.println("Digite as idades das pessoas. Digite um valor negativo para encerrar.");

        while (true) {
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            if (idade < 0) break;

            total++;
            if (idade < 18) menores18++;
            else maioresOuIguais18++;
        }

        System.out.println("Total de pessoas cadastradas: " + total);
        System.out.println("Porcentagem de menores de 18 anos: " + (menores18 * 100.0 / total) + "%");
        System.out.println("Porcentagem de 18 anos ou mais: " + (maioresOuIguais18 * 100.0 / total) + "%");

        scanner.close();
    }
}
