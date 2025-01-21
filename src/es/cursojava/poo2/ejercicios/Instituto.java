package es.cursojava.poo2.ejercicios;

public class Instituto {

    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Samuel", "Quintero", 24, 8, "samuel2200@hotmail.es");
        
        Alumno alumno2 = new Alumno("Alex", "Morales", 23, 5, "alex@hotmail.es");

        String[] asignaturasAlumno3 = {"matemáticas", "física", "quimica"};
        Alumno alumno3 = new Alumno("Monse", "Britos", 22, 6, "monsebritos@gmail.com", asignaturasAlumno3);

        Alumno alumno4 = new Alumno();
    }

    // Metemos en un array todos los alumnos
    Alumno[] alumnos = {Alumno(alumno1), Alumno(alumno2), Alumno(alumno3), Alumno(alumno4)};

    for (Alumno alumno : alumnos) {
        System.out.println(alumno);
    }
}
}
