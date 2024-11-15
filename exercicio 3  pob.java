import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da turma: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite a quantidade de alunos do sexo masculino: ");
        int masculinos = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos do sexo feminino: ");
        int femininos = scanner.nextInt();

        System.out.print("Digite a quantidade de alunos aprovados: ");
        int aprovados = scanner.nextInt();

        int totalAlunos = masculinos + femininos;
        int reprovados = totalAlunos - aprovados;

        double percMasculinos = (masculinos / (double) totalAlunos) * 100;
        double percFemininos = (femininos / (double) totalAlunos) * 100;
        double percReprovados = (reprovados / (double) totalAlunos) * 100;

        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Porcentagem de alunos do sexo masculino: " + percMasculinos + "%");
        System.out.println("Porcentagem de alunos do sexo feminino: " + percFemininos + "%");
        System.out.println("Porcentagem de alunos reprovados: " + percReprovados + "%");

        scanner.close();
    }
}
