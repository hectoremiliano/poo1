import java.util.Random;

public class _p93_ParesImpares {
    public static void Mostrar(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int MAX = 100;
        int[] a = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            a[i] = rnd.nextInt(21); // Números aleatorios entre 0 y 20
        }

        System.out.println("Elementos del arreglo:");
        Mostrar(a);

        System.out.println("\nElementos pares:");
        int contadorPares = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                contadorPares++;
            }
        }
        System.out.println("\nCantidad de elementos pares: " + contadorPares);

        System.out.println("Elementos impares:");
        int contadorImpares = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                contadorImpares++;
            }
        }
        System.out.println("\nCantidad de elementos impares: " + contadorImpares);
    }
}
