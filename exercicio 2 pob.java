import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("A temperatura em Celsius é: " + celsius);

        scanner.close();
    }
}
