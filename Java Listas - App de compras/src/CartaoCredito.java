public class CartaoCredito {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public CartaoCredito(double limite) {}
}
