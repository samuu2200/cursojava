package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
	  Scanner scanner = new Scanner(System.in);

        // Preguntar cuántas aulas tiene el colegio
        System.out.print("¿Cuántas aulas tiene el colegio?: ");
        int numAulas = scanner.nextInt();
        scanner.nextLine();

        // Crear un array bidimensional para almacenar los alumnos 
        String[][] aulas = new String[numAulas][5];

        // Menú
        int opcion;
        do {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Añadir alumnos por aula");
            System.out.println("2. Mostrar alumnos por aula");
            System.out.println("3. Buscar un alumno");
            System.out.println("4. Borrar un alumno");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: // Añadir alumnos
                    for (int i = 0; i < numAulas; i++) {
                        System.out.println("\nAñadiendo alumnos para el aula " + (i + 1) + ":");
                        for (int j = 0; j < 5; j++) {
                            if (aulas[i][j] == null) {
                                System.out.print("Introduce el nombre del alumno para la mesa " + (j + 1) + ": ");
                                aulas[i][j] = scanner.nextLine();
                            }
                        }
                    }
                    break;

                case 2: // Mostrar alumnos por aula
                    System.out.println("\nAlumnos por aula:");
                    for (int i = 0; i < numAulas; i++) {
                        System.out.println("Aula " + (i + 1) + ":");
                        for (int j = 0; j < 5; j++) {
                            if (aulas[i][j] != null) {
                                System.out.println("- " + aulas[i][j]);
                            } else {
                                System.out.println("- [Vacío]");
                            }
                        }
                    }
                    break;

                case 3: // Buscar alumno
                    System.out.print("\nIntroduce el nombre del alumno a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < numAulas; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (aulas[i][j] != null && aulas[i][j].equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("El alumno " + nombreBuscar + " está en el aula " + (i + 1) + ", mesa " + (j + 1));
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado) break;
                    }
                    if (!encontrado) {
                        System.out.println("El alumno " + nombreBuscar + " no se encuentra en el colegio.");
                    }
                    break;

                case 4: // Borrar alumno
                    System.out.print("\nIntroduce el nombre del alumno a borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    boolean borrado = false;

                    for (int i = 0; i < numAulas; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (aulas[i][j] != null && aulas[i][j].equalsIgnoreCase(nombreBorrar)) {
                                System.out.print("¿Estás seguro de que quieres borrar a " + nombreBorrar + "? (s/n): ");
                                String confirmacion = scanner.nextLine();
                                if (confirmacion.equalsIgnoreCase("s")) {
                                    aulas[i][j] = null;
                                    System.out.println("El alumno " + nombreBorrar + " ha sido borrado.");
                                    borrado = true;
                                } else {
                                    System.out.println("El borrado fue cancelado.");
                                }
                                break;
                            }
                        }
                        if (borrado) break;
                    }
                    if (!borrado) {
                        System.out.println("El alumno " + nombreBorrar + " no se encuentra en el colegio.");
                    }
                    break;

                case 5: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
	}
		
}


