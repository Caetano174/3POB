public class Main {
    public static void main(String[] args) {
        // Criando um cliente Pessoa Física
        PessoaFisica pf = new PessoaFisica(
                "Rua das Laranjeiras, 123", 
                "(21) 98765-4321", 
                "123.456.789-00", 
                "João Silva"
        );

        // Criando um cliente Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica(
                "Av. das Américas, 456", 
                "(21) 91234-5678", 
                "12.345.678/0001-90", 
                "Empresa XPTO Ltda."
        );

        // Exibindo os dados
        System.out.println("Dados dos Clientes:\n");
        pf.exibirDados();
        System.out.println();
        pj.exibirDados();
    }
}
