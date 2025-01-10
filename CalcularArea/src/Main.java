import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList();

        Circulo circuloPequeno =  new Circulo(3);
        circuloPequeno.calcularArea();
        lista.add(circuloPequeno);

        Circulo circuloGrande =  new Circulo(9.5);
        circuloGrande.calcularArea();
        lista.add(circuloGrande);

        Quadrado quadradoPequeno =  new Quadrado(2.5);
        quadradoPequeno.calcularArea();
        lista.add(quadradoPequeno);

        Quadrado quadradoGrande =  new Quadrado(10);
        quadradoGrande.calcularArea();
        lista.add(quadradoGrande);

        for (Forma forma : lista) {
            if (forma instanceof Quadrado) {
                System.out.println("Quadrado - Área: " + ((Quadrado) forma).getArea());
            } else if (forma instanceof Circulo) {
                System.out.println("Círculo - Área: " + ((Circulo) forma).getArea());
            }
        }


   }
}