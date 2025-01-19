package es.cursojava.inicio.funciones;

public class EjercicioMenu {

    public static void main(String[] args) {

        // Preguntar cuántas aulas tiene el colegio
        int numAulas = Utilidades.pideDatoNumerico("¿Cuántas aulas tiene el colegio?");
        
        // Crear un array bidimensional para almacenar los alumnos
        String[][] aulas = new String[numAulas][5];

        // Menú
        int opcion;
        do {

            FuncionesDelMenu.mostrarMenu();
            opcion = Utilidades.pideOpcion("\nIntroduce una opción: ");
            
            switch (opcion) {
                case 1: // Añadir alumnos

                    FuncionesDelMenu.agregarAlumnos(aulas); break;
                    
                case 2: // Mostrar alumnos por aula

                    FuncionesDelMenu.mostrarAlumnos(aulas); break;
                
                case 3: // Buscar alumno

                    FuncionesDelMenu.buscarAlumno(aulas); break;

                case 4: // Borrar alumno

                    FuncionesDelMenu.borrarAlumno(aulas); break;

                case 5: // Salir3
                    System.out.println("Saliendo del programa..."); break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);

    }

}
