// Programa _p51_SerieFibonacci
import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        int max;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Impresión de la serie Fibonacci\n");
            System.out.print("Ingrese el valor máximo: ");
            max = obj.nextInt();
            System.out.println("La serie Fibonacci es:");
            int a = 0, b = 1;
            while (a <= max) {
                System.out.print(a + " ");
                int temp = a;
                a = b;
                b = temp + b;
            }
            System.out.println("\n¿Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
