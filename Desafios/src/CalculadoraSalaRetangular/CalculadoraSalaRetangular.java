package CalculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double largura, double altura) {
        return 2 * largura + 2 * altura;
    }

}
