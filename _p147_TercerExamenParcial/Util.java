package _p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Juan Pérez", 25, 'M', "Soltero", "Delantero", 50000.0));
        datos.add(new Jugador("María Gómez", 22, 'F', "Casado", "Defensa", 45000.0));
        // Agrega más jugadores según sea necesario
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (ObjectOutputStream fpersonas = new ObjectOutputStream(new FileOutputStream(archivo))) {
            fpersonas.writeObject(datos);
        }
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream fpersonas = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Jugador>) fpersonas.readObject();
        }
    }
}