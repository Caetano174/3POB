import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, masculino = 0, feminino = 0;
        char sexo;

        System.out.println("Digite o sexo das pessoas (M/F). Digite 'X' para encerrar.");

        while (true) {
            System.out.print("Sexo: ");
            sexo = scanner.next().charAt(0);
            if (sexo == 'X' || sexo == 'x') break;

            total++;
            if (sexo == 'M' || sexo == 'm') masculino++;
            if (sexo == 'F' || sexo == 'f') feminino++;
        }

        System.out.println("Total de pessoas cadastradas: " + total);
        System.out.println("Total de homens: " + masculino);
        System.out.println("Total de mulheres: " + feminino);

        scanner.close();
    }
}
