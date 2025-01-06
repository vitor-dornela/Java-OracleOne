//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(100.0);
        Servico servico = new Servico(200.0);

        CalculadoraImposto calculadora = new CalculadoraImposto();
        calculadora.calcularImposto(produto); // Calcula imposto do produto
        calculadora.calcularImposto(servico); // Calcula imposto do serviço

        System.out.println("Total de impostos: " + calculadora.getTotalImposto());
    }
}