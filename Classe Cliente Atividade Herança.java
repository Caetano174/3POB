public class Cliente {
    private String endereco;
    private String telefone;

    public Cliente(String endereco, String telefone) {
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
