// Programa _p48_ImparesAscendente
import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int n, c, suma = 0;
        float promedio;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime números impares ascendente\n");
            System.out.print("Hasta donde ? ");
            n = obj.nextInt();
            c = 1;
            System.out.print("Números impares entre 1 y " + n + ": ");
            while (c <= n) {
                System.out.printf("%d ", c);
                suma += c;
                c += 2;
            }
            promedio = (float) suma / (n / 2 + 1);
            System.out.println("\nLa suma es " + suma + ", el promedio es " + promedio);
            System.out.print("¿Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
