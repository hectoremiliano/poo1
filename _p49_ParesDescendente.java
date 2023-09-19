// Programa _p49_ParesDescendente
import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        int n, c, suma = 0, conteo = 0;
        float promedio;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime números pares descendente\n");
            System.out.print("Hasta donde ? ");
            n = obj.nextInt();
            c = 100;
            System.out.print("Números pares entre 100 y " + n + ": ");
            while (c >= n) {
                System.out.printf("%d ", c);
                suma += c;
                conteo++;
                c -= 2;
            }
            promedio = (float) suma / conteo;
            System.out.println("\nLa suma es " + suma + ", el promedio es " + promedio);
            System.out.print("¿Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
