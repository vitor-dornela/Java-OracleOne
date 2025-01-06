package CalculadoraSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        double altura = 44.12;
        double largura = 12.25;
        double area1 = calculadora.calcularArea(altura, largura);
        double perimetro1 = calculadora.calcularPerimetro(altura, largura);

        System.out.println("""
                A área é de %.2f m² e o perímetro de %.2f
                """.formatted(area1, perimetro1));

    }
}
