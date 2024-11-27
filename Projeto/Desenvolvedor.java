package model;

public class Desenvolvedor extends Funcionario implements Desenvolve {

    public Desenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void codar() {
        System.out.println("Codificando...");
    }

    @Override
    public void resolverProblemas() {
        System.out.println("Resolvendo problemas técnicos...");
    }

    @Override
    public String mostrarDetalhes() {
        return "ID: " + getId() + " | Desenvolvedor: " + getNome() + " | Salário: " + getSalario();
    }
}
