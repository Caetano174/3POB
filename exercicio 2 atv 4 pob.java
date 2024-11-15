import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> matriculas = new ArrayList<>();
        ArrayList<Double> salariosBrutos = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite a matrícula do empregado " + i + ": ");
            matriculas.add(scanner.next());
            System.out.print("Digite o salário bruto do empregado " + i + ": ");
            salariosBrutos.add(scanner.nextDouble());
        }

        System.out.println("\nRelatório:");
        for (int i = 0; i < 100; i++) {
            double desconto = salariosBrutos.get(i) * 0.11;
            double salarioLiquido = salariosBrutos.get(i) - desconto;
            System.out.println("Matrícula: " + matriculas.get(i) +
                    ", Salário Bruto: R$ " + salariosBrutos.get(i) +
                    ", Desconto: R$ " + desconto +
                    ", Salário Líquido: R$ " + salarioLiquido);
        }

        scanner.close();
    }
}
