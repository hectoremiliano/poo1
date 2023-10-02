import java.util.Scanner;

public class _p92_MayorMenor {
    public static void Mostrar(int[] numeros) {
        for (int numero : numeros)
            System.out.print(numero + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números ingresados:");
        Mostrar(numeros);

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}
