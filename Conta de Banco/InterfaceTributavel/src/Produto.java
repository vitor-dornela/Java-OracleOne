public class Produto implements Tributavel {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    @Override
    public double getValorImposto() {
        return this.preco * 0.1; // 10% de imposto
    }

}