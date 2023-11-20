import java.io.*;
import java.util.ArrayList;

// Clase Persona debe ser serializable
class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private double peso;
    private String correo;

    public Persona(String nombre, int edad, double peso, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", correo='" + correo + '\'' +
                '}';
    }
}

public class _p136_Archivos5 {

    // Función para serializar datos y escribir en un archivo
    private static void serializarDatos(String archivo, ArrayList<Persona> personas) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(personas);
        }
    }

    // Función para deserializar datos y leer desde un archivo
    private static ArrayList<Persona> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Persona>) ois.readObject();
        }
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos Perez", 22, 85.5, "cperez@gmail.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));
        personas.add(new Persona("Maria Lopez", 15, 34.56, "mlopez@msn.com"));

        try {
            serializarDatos("datos.dat", personas);
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }

        try {
            ArrayList<Persona> laspersonas = desSerializarDatos("datos.dat");
            System.out.println("Los datos leídos del archivo son:");
            laspersonas.forEach(p -> System.out.println(p));
            System.out.println(laspersonas.size());
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e);
        }
    }
}
