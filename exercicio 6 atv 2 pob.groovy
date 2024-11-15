import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o nome do empregado: ");
        scanner.nextLine(); // Consumir quebra de linha
        String nome = scanner.nextLine();

        System.out.print("Digite o salário bruto do empregado: ");
        double salarioBruto = scanner.nextDouble();

        double desconto = 0;
        if (salarioBruto < salarioMinimo) {
            desconto = salarioBruto * 0.02;
        } else if (salarioBruto == salarioMinimo) {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.08;
        }

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
