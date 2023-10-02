public class _p90_Temperaturas {
    public static void Mostrar(float[] temps) {
        for (float temp : temps)
            System.out.print(temp + " ");
    }

    public static void main(String[] args) {
        float[] temperaturas = { 2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f };
        System.out.println("Primer elemento del arreglo: " + temperaturas[0]);
        System.out.println("Tercer elemento del arreglo: " + temperaturas[2]);
        System.out.println("Elementos del arreglo:");
        Mostrar(temperaturas);

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        System.out.println("\nElementos del arreglo después de poner a 0 los mayores a 10:");
        Mostrar(temperaturas);
    }
}
