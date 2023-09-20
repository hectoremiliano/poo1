import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("¿Cuántos renglones? ");
        n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
