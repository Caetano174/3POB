public class Main {
    public static void main(String[] args) {
        // Criando um Funcionário
        Funcionario funcionario = new Funcionario("123.456.789-00", "João da Silva", 2500.00f, "F001");

        // Criando um Gerente
        Gerente gerente = new Gerente("987.654.321-00", "Maria Oliveira", 5000.00f, "G001", 1500.00f);

        // Criando um membro do setor de Vendas
        Vendas vendas = new Vendas("456.789.123-00", "Carlos Souza", 3500.00f, "V001", 1000.00f, 2000.00f);

        // Exibindo os dados
        System.out.println("--- Dados do Funcionário ---");
        funcionario.exibirDados();

        System.out.println("\n--- Dados do Gerente ---");
        gerente.exibirDados();

        System.out.println("\n--- Dados do Setor de Vendas ---");
        vendas.exibirDados();
    }
}
