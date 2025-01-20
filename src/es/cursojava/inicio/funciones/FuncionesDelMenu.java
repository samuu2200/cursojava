package es.cursojava.inicio.funciones;

public class FuncionesDelMenu {

    /**
     * Función que sirve para pintar las opciones de un menú que llegan en un array de String's 
     * @param menuArray Array Strings con las opciones del menú
     * @samuu2200
     * @since 1.0
     * @return Devuelve todo lo que haya contenido en el array de String que en este caso es el menú
     */
    public static void mostrarMenu() {
        String[] mostrarMenu = {"1. Añadir alumnos", "2. Mostrar alumnos", "3. Buscar Alumnos", "4. Borrar alumnos", "5. Salir"};
        for (String menu : mostrarMenu) {
            System.out.println(menu);
        }
    }

    // Añadir alumnos
    /**
     * Función que nos sirve para guardar los que nos pasan por un parametro (String[][]) y que lo que hace es recorrer el array que le pasamos por parametros, asignamos valores al array y lo mostramos
     * @param numAulas
     * @samuu2200
     * @since 1.0
     */
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
    /**
     * Función le pasamos un array la recoje para saber si hay alumnos y no muestra el resultado
     * @param numAulas
     * @samuu2200
     * @since 1.0
     */
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
    /**
     * Función que recorre el array y que buscar si hay un alumno o no, y nos muestra el resultado
     * @param numAulas
     * @samuu2200
     * @since 1.0
     */
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
    /**
     * Función que recorre el array que le pasamos por parámetro y si hay alguna coincidencia procede a borrar o sobreescribir el valor a [VACIO]
     * @samuu2200
     * @since 1.0
     * @param numAulas
     */
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
