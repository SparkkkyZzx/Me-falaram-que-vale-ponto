public class produto {
    public String getNome() {
        return nome;
    }
public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    String nome;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    double preco;

    @Override
    public String toString() {
        return "produto{nome='" + nome + "', preco=" + String.format("%.2f", preco) + "}";
}
};
