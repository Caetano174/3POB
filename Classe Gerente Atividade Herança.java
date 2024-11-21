public class Gerente extends Funcionario {
    private float gratificacao;

    public Gerente(String cpf, String nome, float salario, String matricula, float gratificacao) {
        super(cpf, nome, salario, matricula);
        this.gratificacao = gratificacao;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Gratificação: R$" + gratificacao);
    }
}
