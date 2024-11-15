import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        System.out.print("Digite o valor de Z: ");
        int z = scanner.nextInt();

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("É um triângulo equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}
