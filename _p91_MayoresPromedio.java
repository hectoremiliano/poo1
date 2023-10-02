import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void Mostrar(float[] calificaciones) {
        for (float calificacion : calificaciones)
            System.out.print(calificacion + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();
        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        System.out.println("Calificaciones ingresadas:");
        Mostrar(calificaciones);

        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.println("\nSuma de calificaciones: " + suma);
        System.out.println("Promedio de calificaciones: " + promedio);

        System.out.println("Calificaciones mayores al promedio:");
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.print(calificacion + " ");
            }
        }

        int contador = 0;
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                contador++;
            }
        }
        System.out.println("\nCantidad de calificaciones mayores al promedio: " + contador);
    }
}
