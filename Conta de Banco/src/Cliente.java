public class Cliente {
    String nome;
    String tipoConta;
    double saldo = 0;

    public String mostrarDados() {
        return """
                ********************************************
                Nome:           %s
                Tipo de conta:  %s
                Saldo inicial:  R$ %.2f
                ********************************************
                """.formatted(this.nome, this.tipoConta, this.saldo);
    }
}
