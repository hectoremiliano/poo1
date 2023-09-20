import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int n;
        int term = 1;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("¿Cuántos términos? ");
        n = obj.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(term);
            sum += term;
            term = term * 10 + 1;
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Suma " + sum);
    }
}
