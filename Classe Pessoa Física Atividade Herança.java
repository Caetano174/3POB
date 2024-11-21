public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;

    public PessoaFisica(String endereco, String telefone, String cpf, String nome) {
        super(endereco, telefone);
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        super.exibirDados();
    }
}
