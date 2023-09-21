import java.util.Scanner;

public class _p79_Angulo {
    public static String TipoAngulo(int angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else {
            return "Ángulo no válido";
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingrese un ángulo entre 0 y 360 grados: ");
        int angulo = obj.nextInt();
        if (angulo >= 0 && angulo <= 360) {
            String tipo = TipoAngulo(angulo);
            System.out.printf("\nEl ángulo es : %s", tipo);
        } else {
            System.out.println("Ángulo fuera de rango.");
        }
    }
}
