import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa inicial (em gramas): ");
        double massa = scanner.nextDouble();
        int tempo = 0;

        while (massa >= 0.5) {
            massa /= 2;
            tempo += 50;
        }

        System.out.println("Massa final: " + massa + "g");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        scanner.close();
    }
}
