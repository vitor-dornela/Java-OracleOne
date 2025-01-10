public class Quadrado implements Forma{

    private double ladoQuadrado;
    private double area;

    public Quadrado(double ladoQuadrado){
        this.ladoQuadrado = ladoQuadrado;
    }

    public double getArea() {
        return area;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(this.ladoQuadrado, 2);
    }
}
