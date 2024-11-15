import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, menos160 = 0, entre160e180 = 0, mais180 = 0;

        System.out.println("Digite a altura das pessoas. Digite um valor negativo para encerrar.");

        while (true) {
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            if (altura < 0) break;

            total++;
            if (altura < 1.60) menos160++;
            else if (altura <= 1.80) entre160e180++;
            else mais180++;
        }

        System.out.println("Total de pessoas cadastradas: " + total);
        System.out.println("Altura < 1,60m: " + menos160);
        System.out.println("1,60m <= Altura <= 1,80m: " + entre160e180);
        System.out.println("Altura > 1,80m: " + mais180);

        scanner.close();
    }
}
