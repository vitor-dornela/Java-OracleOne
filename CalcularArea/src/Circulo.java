public class Circulo implements Forma{

    private double raioCirculo;
    private double area;

    public double getArea() {
        return area;
    }

    public Circulo(double raioCirculo) {
        this.raioCirculo = raioCirculo;
    }

    @Override
    public void calcularArea() {
        area =  Math.PI * Math.pow(raioCirculo, 2);
    }
}
