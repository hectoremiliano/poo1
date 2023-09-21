import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static double PulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double MetrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir pulgadas a centímetros.");
        System.out.println("2. Convertir metros a pies.");
        System.out.print("Opción: ");
        int opcion = obj.nextInt();
        if (opcion == 1) {
            System.out.print("Ingrese la longitud en pulgadas: ");
            double pulgadas = obj.nextDouble();
            double centimetros = PulgadasACentimetros(pulgadas);
            System.out.printf("\n%.2f pulgadas son %.2f centímetros.", pulgadas, centimetros);
        } else if (opcion == 2) {
            System.out.print("Ingrese la longitud en metros: ");
            double metros = obj.nextDouble();
            double pies = MetrosAPies(metros);
            System.out.printf("\n%.2f metros son %.2f pies.", metros, pies);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}