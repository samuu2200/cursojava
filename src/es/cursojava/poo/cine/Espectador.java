package es.cursojava.poo.cine;

import java.util.Scanner;

public class Espectador {
    // Variables de instancia
    private String nombre;
    private String dni;
    private int opcion;

    // Constructor
    public Espectador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Espectador(String nombre, String dni, int opcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.opcion = opcion;
    }

    // Getter & Setter
    public int getOpcion() {
        return opcion;
    }
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public int opcion(Espectador[] espectadores) {
        int opcion = 0;
        for (Espectador espectador : espectadores) {
            opcion = Utilidades.pideDatoNumerico(nombre + " Elige una opción: ");
        }
        return opcion;
    }
}
