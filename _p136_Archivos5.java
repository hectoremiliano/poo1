import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _p136_Archivos5 {

public static void main(String[] args) {
ArrayList<Persona> personas = new ArrayList<>();
personas.add(new Persona("Carlos Perez", 22, 85.5, "cperez@gmail.com"));
personas.add(new Persona("Maria Lopez", 15, 34.56 , "mlopez@msn.com"));
personas.add(new Persona("Maria Lopez", 15, 34.56 , "mlopez@msn.com"));
try {

serializarDatos("datos.dat", personas);

} catch (Exception e) {

System.out.println("Problemas al procesar el archivo: " + e );

}
try {
ArrayList<Persona> laspersonas = desSerializarDatos("datos.dat");
System.out.println("Los datos leidos del archivo son:");
laspersonas.forEach(p->System.out.println(p));
System.out.println(laspersonas.size());
} catch (Exception e) {

System.out.println("Problemas al preocesar el archivo.." + e);

}
}
}