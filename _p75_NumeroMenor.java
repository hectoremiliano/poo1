import java.util.Scanner;

public class _p75_NumeroMenor {
    public static int NumeroMenor(int n1, int n2, int n3, int n4) {
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame cuatro números enteros separados por espacio ? ");
        int n1 = obj.nextInt();
        int n2 = obj.nextInt();
        int n3 = obj.nextInt();
        int n4 = obj.nextInt();
        int menor = NumeroMenor(n1, n2, n3, n4);
        System.out.printf("\nEl número menor es : %d", menor);
    }
}
