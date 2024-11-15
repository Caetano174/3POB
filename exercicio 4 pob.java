import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de games vendidos: ");
        int games = scanner.nextInt();

        System.out.print("Digite o preço de cada game: ");
        double precoGame = scanner.nextDouble();

        System.out.print("Digite o total de calculadoras vendidas: ");
        int calculadoras = scanner.nextInt();

        System.out.print("Digite o preço de cada calculadora: ");
        double precoCalculadora = scanner.nextDouble();

        System.out.print("Digite o total de canetas vendidas: ");
        int canetas = scanner.nextInt();

        System.out.print("Digite o preço de cada caneta: ");
        double precoCaneta = scanner.nextDouble();

        double faturamentoGames = games * precoGame;
        double faturamentoCalculadoras = calculadoras * precoCalculadora;
        double faturamentoCanetas = canetas * precoCaneta;
        double faturamentoTotal = faturamentoGames + faturamentoCalculadoras + faturamentoCanetas;

        System.out.println("Faturamento com games: R$ " + faturamentoGames);
        System.out.println("Faturamento com calculadoras: R$ " + faturamentoCalculadoras);
        System.out.println("Faturamento com canetas: R$ " + faturamentoCanetas);
        System.out.println("Faturamento total: R$ " + faturamentoTotal);

        scanner.close();
    }
}
