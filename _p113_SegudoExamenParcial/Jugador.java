package _p113_SegudoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    protected double Salario; 
    private char Sexo;
    private String Descripcion;
    protected double Total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
        Total = 0.0;
    }

    public abstract double getBono();

    public char getSexo() {
        return Sexo;
    }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario + "]";
    }
}