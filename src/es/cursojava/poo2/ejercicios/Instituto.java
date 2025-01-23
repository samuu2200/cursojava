package es.cursojava.poo2.ejercicios;

public class Instituto {

    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Samuel", "Quintero", 24, 8, "samuel2200@hotmail.es");
        
        Alumno alumno2 = new Alumno("Alex", "Morales", 23, 5, "alex@hotmail.es");

        String[] asignaturasAlumno3 = {"matemáticas", "física", "quimica"};
        Alumno alumno3 = new Alumno("Monse", "Britos", 22, 6, "monsebritos@gmail.com", asignaturasAlumno3);

        Alumno alumno4 = new Alumno();

        // Metemos en un array todos los alumnos
        Alumno[] alumnos = {alumno1, alumno2, alumno3, alumno4};

        // Recorremos el array de alumnos con un for 
/*         for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            System.out.println(alumno.getNombre());

            alumno.estudiar();

            // Recuperamos las asignaturas que es un array
            String[] asing = alumno.getAsignaturas();
            if (asing != null) {
                for (String asignatura : asing) {
                    System.out.println("\t" + asignatura);
                }
            }
        } */

        // Recorremos el array de alumnos con un for each
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());

            alumno.estudiar();

            // Recuperamos las asignaturas que es un array
            String[] asing = alumno.getAsignaturas();
            if (asing != null) {
                for (String asignatura : asing) {
                    System.out.println("\t" + asignatura);
                }
            }
        }
    }

}

