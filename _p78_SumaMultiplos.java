import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        if (ini < fin) {
            for (int i = ini; i <= fin; i++) {
                if ((constante == 3 && i % 3 == 0) || (constante == 4 && i % 4 == 0)) {
                    suma += i;
                }
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Valor incial ? ");
        int ini = obj.nextInt();
        System.out.print("Valor final ? ");
        int fin = obj.nextInt();
        System.out.print("Ingrese 3 para múltiplos de 3 o 4 para múltiplos de 4: ");
        int constante = obj.nextInt();
        if (constante == 3 || constante == 4) {
            int suma = SumaMultiplos(ini, fin, constante);
            System.out.printf("\nLa suma es : %d", suma);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

