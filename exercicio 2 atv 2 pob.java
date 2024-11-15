import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Idade aproximada: " + idade);
        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else {
            System.out.println("É eleitor.");
        }

        scanner.close();
    }
}
