import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Forma de pagamento (1-Dinheiro, 2-Cheque, 3-Cartão débito, 4-Cartão crédito): ");
        int formaPagamento = scanner.nextInt();

        double total = quantidade * precoUnitario;
        double desconto = 0;

        switch (formaPagamento) {
            case 1 -> desconto = total * 0.10;
            case 2 -> desconto = total * 0.02;
            case 3 -> desconto = total * 0.05;
            case 4 -> desconto = total * 0.03;
        }

        double valorFinal = total - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
