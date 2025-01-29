package es.cursojava.poo.cine;

import java.util.Scanner;

public class Cine {
    // Variables de instancia
    private String nombre;
    private Sala[] salas;


    // Constructor
    public Cine(String nombre, Sala[] salas) {
        this.nombre = nombre;
        this.salas = salas;
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public void darBienvenida() {
        System.out.println("¡Bienvenidos a " + nombre + "!");
    }

    /**
     * Método donde le pasamos a los espectadores la cartelera del cine
     * @param texto
     */
    public void mostrarCartelera(String texto) {
        System.out.println(texto);
        System.out.println("-Sala 1: Lo que el agua se llevó");
        System.out.println("-Sala 2: La carrera del caballo paralitico");
        System.out.println("-Sala 3:    ");
    }


    /**
     * Método que no da la disponibilidades de las butacas
     * @param butacas
     * @param texto
     */
    public void darDisponibilidad(Espectador[][] butacas, String texto) {
        System.out.println(texto);
        for (int i = 0; i < butacas.length; i++){
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(" O ");
            }
            System.out.println("  ");
        }
    }



}
