// Programa _p50_ConversionTemperaturas
import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int inicial, finalT;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Conversión de temperaturas de grados centígrados a grados Fahrenheit\n");
            do {
                System.out.print("Temperatura inicial: ");
                inicial = obj.nextInt();
                System.out.print("Temperatura final: ");
                finalT = obj.nextInt();
            } while (finalT < inicial);
            System.out.println("------------------------------------");
            System.out.println("Centígrados\tFahrenheit");
            System.out.println("------------------------------------");
            for (int c = inicial; c <= finalT; c++) {
                float fahrenheit = (c * 9.0f / 5.0f) + 32.0f;
                System.out.printf("%d\t\t%.2f\n", c, fahrenheit);
            }
            System.out.println("------------------------------------");
            System.out.print("\n¿Deseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
