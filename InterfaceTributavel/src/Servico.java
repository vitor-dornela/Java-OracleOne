public class Servico implements Tributavel {
    private double taxa;

    public Servico(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getValorImposto() {
        return this.taxa * 0.15; // 15% de imposto
    }
}