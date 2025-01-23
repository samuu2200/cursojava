package es.cursojava.poo2.ejercicios;

public class Alumno {

    private String nombre;
    private String apellidos;
    private int edad;
    private double notaMedia;
    private String email;
    private String[] asignaturas;
    
    // Constructores
    // Constructor por defecto
    public Alumno() {

    }
    // A
    public Alumno(String nombre, String apellidos, int edad, double notaMedia, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.email = email;
    }
    // B
    public Alumno(String nombre, String apellidos, int edad, double notaMedia, String email, String[] asignaturas){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.email = email;
        this.asignaturas = asignaturas;
    } 
    
    // Getter y Setter
    // Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = this.nombre;
    }

    // Apellidos
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        apellidos = this.apellidos;
    }

    // Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // notaMedia
    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Asignaturas
    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }


    // Método estudiar
    public void estudiar() {
        if (notaMedia == 0) {
            System.out.println("No estudia nada");
        } else if (notaMedia < 5) {
            System.out.println("Estudia muy poco");
        } else if (notaMedia < 7) {
            System.out.println("Buen estudiante");
        } else if (notaMedia < 10) {
            System.out.println("Es un genio");
        } else {
            System.out.println("Ha habido un error");
        }
    }
    
    
    
    
    
    
    
    
    

    // objetos con las características 
    // VARIABLES DE INSTANCIA -> TODAS PRIVADAS
    // nombre, apellidos, edad, notaMedia, email, asignaturas:[]


    // Constructores
    // A- uno que inicialice todo menos las asignaturas
    // B- y otro que inicialice todas las variables de instancia

    // Un método estudiar() y lo que tiene que decir es si el estudiante ha estudiado o no
    // == 0 No estudia nada
    // < 5 estudia muy poco
    // < 7 Buen estudiante
    // < 10 Es un genio

    // Clase Instituto con el método main donde vamos a crear 4 objetos de tipo alumno
    // + 2 objetos se van a crear con el constructor A
    // + 1 objeto se va a crear con el constructor B
    // + 1 objeto se va a crear con el constructor por defecto

    // -Meter en un array a todos los alumnos y -por cada alumno vamos a recorrer el array y según lo -recorramos vamos a mostrar el nombre del alumno, -lo ponemos a estudiar y por último mostramos las asignatura de ese alumno
}
