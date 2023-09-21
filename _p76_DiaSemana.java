import java.util.Scanner;

public class _p76_DiaSemana {
    public static String DiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo de tacos";
            default:
                return "Número fuera de rango";
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame un número entero entre 1 y 7: ");
        int numero = obj.nextInt();
        if (numero >= 1 && numero <= 7) {
            String dia = DiaSemana(numero);
            System.out.printf("\nEl día de la semana es : %s", dia);
        } else {
            System.out.println("Número fuera de rango.");
        }
    }
}
