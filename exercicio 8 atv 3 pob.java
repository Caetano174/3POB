import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaAlturas = 0, maiorAltura = 0;
        String nomeMaisAlto = "";

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();

            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = scanner.nextDouble();

            somaAlturas += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlto = nome;
            }
        }

        System.out.println("Altura média do grupo: " + (somaAlturas / 10));
        System.out.println("Pessoa mais alta: " + nomeMaisAlto + " (" + maiorAltura + "m)");

        scanner.close();
    }
}
