package es.cursojava.poo.cine;

import java.util.Scanner;

public class PruebaCine {

    public static void main(String[] args) {

        // Creamos un array bidimencionla de butacas
        Espectador[][] butacas = new Espectador[3][3];

        // Objeto Sala
        Sala sala1 = new Sala(1, "La carrera del caballo paralitico", butacas);
        Sala sala2 = new Sala(2, "Spider-man", butacas);
        Sala sala3 = new Sala(3, "Oppenheimer", butacas);
        Sala[] salas = {sala1, sala2, sala3};
        
        // Objeto espectadores
        Espectador espectador1 = new Espectador("Darío", "0123A");
        Espectador espectador2 = new Espectador("Samuel", "0987T");
        Espectador espectador3 = new Espectador("Quintero", "05678G");

        Espectador[] espectadores = {espectador1, espectador2, espectador3};
        
        // Obejto cine 
        Cine cine = new Cine("Pirineos", salas);

        for (int i = 0; i < espectadores.length; i++) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Qué pelicula quieres ver?");
           Espectador peliculaElegir = scan.;
           espectadores[i] = peliculaElegir;
        }
    }

}
