public class Funcionario {
    private String cpf;
    private String nome;
    private float salario;
    private String matricula;

    public Funcionario(String cpf, String nome, float salario, String matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$" + salario);
        System.out.println("Matrícula: " + matricula);
    }
}
