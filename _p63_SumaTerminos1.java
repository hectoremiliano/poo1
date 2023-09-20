import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            float term = 1.0f / i;
            sum += term;
            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Suma " + sum);
    }
}
