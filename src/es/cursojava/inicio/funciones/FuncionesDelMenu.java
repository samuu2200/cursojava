package es.cursojava.inicio.funciones;

public class FuncionesDelMenu {

    // Mostrar menú
    public static void mostrarMenu() {
        String[] mostrarMenu = {"1. Añadir alumnos", "2. Mostrar alumnos", "3. Buscar Alumnos", "4. Borrar alumnos", "5. Salir"};
        for (String menu : mostrarMenu) {
            System.out.println(menu);
        }
    }

    // Añadir alumnos
    public static void agregarAlumnos(String[][] numAulas) {
        for (int i = 0; i < numAulas.length; i++) {
            System.out.println("\nAñadiendo alumnos para el aula " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                if (numAulas[i][j] == null) {
                    numAulas[i][j] = Utilidades.pideDatoCadena("Introduce el nombre del alumno para la mesa " + (j + 1) + ": ");
                }
            }
        }
    }

    // Mostrar alumnos
    public static void mostrarAlumnos(String[][] numAulas) {
        System.out.println("\nAlumnos por aula:");
        for (int i = 0; i < numAulas.length ; i++) {
            System.out.println("Aula " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                if (numAulas[i][j] != null) {
                    System.out.println("- " + numAulas[i][j]);
                } else {
                    System.out.println("- [Vacío]");
                }
            }
        }
    }

    // Buscar alumnos
    public static void buscarAlumno(String[][] numAulas) {
        String nombreBuscar = Utilidades.pideDatoCadena("Introduce el nombre del alumno a buscar: ");
        boolean encontrado = false;
        for (int i = 0; i < numAulas.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (numAulas[i][j] != null && numAulas[i][j].equalsIgnoreCase(nombreBuscar)) {
                    System.out.println("El alumno " + nombreBuscar + " está en el aula " + (i + 1)
                            + ", mesa " + (j + 1));
                    encontrado = true;
                    break;
                }
            }
            if (encontrado)
                break;
        }
        if (!encontrado) {
            System.out.println("El alumno " + nombreBuscar + " no se encuentra en el colegio.");
        }
    }

    // Borrar alumno
    public static void borrarAlumno(String[][] numAulas) {
        String nombreBorrar = Utilidades.pideDatoCadena("Introduce el nombre del alumno a borrar: ");
        boolean borrado = false;

        for (int i = 0; i < numAulas.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (numAulas[i][j] != null && numAulas[i][j].equalsIgnoreCase(nombreBorrar)) {
                    System.out.print("¿Estás seguro de que quieres borrar a " + nombreBorrar + "? (s/n): ");
                    String confirmacion = "";
                    Utilidades.pideDatoCadena(confirmacion);
                    if (confirmacion.equalsIgnoreCase("s")) {
                        numAulas[i][j] = null;
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
    }

}
