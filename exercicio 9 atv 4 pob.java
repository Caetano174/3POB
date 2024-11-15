import java.util.ArrayList;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número da lista A, posição " + i + ": ");
            listaA.add(scanner.nextInt());
            System.out.print("Digite o número da lista B, posição " + i + ": ");
            listaB.add(scanner.nextInt());
            listaC.add(listaA.get(i - 1) + lista
