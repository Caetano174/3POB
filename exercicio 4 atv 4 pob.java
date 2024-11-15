import java.util.ArrayList;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome do aluno " + i + ": ");
            nomes.add(scanner.next());
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota;
        }

        double media = soma / 10;
        System.out.println("\nNota média da turma: " + media);

        System.out.println("Alunos com nota superior à média:");
        for (int i = 0; i < 10; i++) {
            if (notas.get(i) > media) {
                System.out.println("Nome: " + nomes.get(i) + ", Nota: " + notas.get(i));
            }
        }

        scanner.close();
    }
}
