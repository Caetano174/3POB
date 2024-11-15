import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = scanner.nextDouble();
            soma += preco;
        }

        System.out.println("Somatório dos preços: R$ " + soma);

        scanner.close();
    }
}
