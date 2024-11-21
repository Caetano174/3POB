public class Vendas extends Gerente {
    private float participacaoLucros;

    public Vendas(String cpf, String nome, float salario, String matricula, float gratificacao, float participacaoLucros) {
        super(cpf, nome, salario, matricula, gratificacao);
        this.participacaoLucros = participacaoLucros;
    }

    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Participação nos Lucros: R$" + participacaoLucros);
    }
}
