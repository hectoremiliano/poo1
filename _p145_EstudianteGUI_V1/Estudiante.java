package _p145_EstudianteGUI_V1;

public class Estudiante {
    private String nombre;
    private int edad;
    private double peso;
    private String correo;

    public Estudiante(String nombre, int edad, double peso, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
    }

    // Getters y setters (pueden ser generados automáticamente por tu IDE)
    
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", correo='" + correo + '\'' +
                '}';
    }

    public Object getEdad() {
        return null;
    }

    public Object getNombre() {
        return null;
    }

    public Object getPeso() {
        return null;
    }

    public Object getCorreo() {
        return null;
    }
}
