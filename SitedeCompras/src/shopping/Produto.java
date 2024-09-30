package shopping;

public class Produto {

    String nome;
    double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto: " + this.nome + ", de R$" + this.valor + ".";
    }
}
