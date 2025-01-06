package ConversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 6.11;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println(String.format("O valor em reais é: R$ %.2f", valorReal));
    }
}
