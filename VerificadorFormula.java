import java.util.Stack;

public class VerificadorFormula {

    public static boolean verificarFormula(String formula) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : formula.toCharArray()) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty() || !esParIgual(pila.pop(), caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    public static boolean esParIgual(char abierto, char cerrado) {
        return (abierto == '(' && cerrado == ')') ||
               (abierto == '{' && cerrado == '}') ||
               (abierto == '[' && cerrado == ']');
    }

    public static void main(String[] args) {
        String formula = "(a + b) * (c - d) / {e - [f + g]}";
        if (verificarFormula(formula)) {
            System.out.println("La fórmula está bien formada.");
        } else {
            System.out.println("La fórmula no está bien formada.");
        }
    }
}
