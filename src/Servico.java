public class Servico {
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirDescricao() {
        System.out.println("Serviço: " + descricao + ", Preço: R$" + preco);
    }
}
