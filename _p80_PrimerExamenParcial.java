import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalDineroAlumnos = 0;
        int totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;
        int totalDineroGeneral = 0;
        int totalEdad = 0;
        int ganancias = 0;

        System.out.print("Ingrese la cantidad de participantes: ");
        int cantidadParticipantes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea.

        for (int i = 0; i < cantidadParticipantes; i++) {
            System.out.println("Datos del participante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea.
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            System.out.print("Tipo de Participante (Alumno/Docente/Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            if (edad >= 18) {
                totalParticipantes++;

                if (tipoParticipante.equalsIgnoreCase("Alumno")) {
                    totalAlumnos++;
                    totalDineroAlumnos += 50;
                } else if (tipoParticipante.equalsIgnoreCase("Docente")) {
                    totalDocentes++;
                    totalDineroDocentes += 80;
                } else if (tipoParticipante.equalsIgnoreCase("Trabajador")) {
                    totalTrabajadores++;
                    totalDineroTrabajadores += 60;
                }

                if (sexo == 'M') {
                    totalMujeres++;
                } else if (sexo == 'F') {
                    totalHombres++;
                }

                totalEdad += edad;
            }
        }

        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        totalEdad = (totalParticipantes > 0) ? totalEdad / totalParticipantes : 0;

        if (totalDineroGeneral < 100) {
            ganancias = 0;
        } else if (totalDineroGeneral < 200) {
            ganancias = 1;
        } else {
            ganancias = 2;
        }

        System.out.println("\nResumen de Inscripciones:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de Edad de todos los participantes: " + totalEdad);

        System.out.println("\nResumen de Dinero Recaudado:");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totalDineroGeneral);

        System.out.println("\nMensaje Final:");
        if (ganancias == 0) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (ganancias == 1) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }
}

