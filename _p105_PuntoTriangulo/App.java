package _p105_PuntoTriangulo;

public class App {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 5);
        Punto p3 = new Punto(5, 0);

        Triangulo triangulo = new Triangulo(p1, p2, p3);

        System.out.println("Triángulo: ");
        System.out.println(triangulo.toString());
        System.out.println("Tipo de Triángulo: " + triangulo.getTipo());
        System.out.println("Perímetro: " + triangulo.getPerimetro());
    }
}
