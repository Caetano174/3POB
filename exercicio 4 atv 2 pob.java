import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do empregado: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo do empregado (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Digite o salário bruto do empregado: ");
        double salarioBruto = scanner.nextDouble();

        double desconto = (sexo == 'M' || sexo == 'm') ? salarioBruto * 0.05 : salarioBruto * 0.03;
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
