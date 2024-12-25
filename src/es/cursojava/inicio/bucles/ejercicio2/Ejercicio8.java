package es.cursojava.inicio.bucles.ejercicio2;

import java.util.Scanner;

//Número de tenistas en el top 10

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario el número de tenistas
		System.out.println("Ingresa el número de participantes que van a jugar "
				+ "la ATP");
		int participantesAtp = scan.nextInt();
		
		//Pedimos las pocisiones de los participantes
		int posiciones = 0;
		for (int i = 0; i < participantesAtp; i++) {
			System.out.print("Ingresa las posiciones del jugador " + (i + 1) + "/" + participantesAtp + ": ");
			posiciones = scan.nextInt();
			
			int tenistas = posiciones;
			if (tenistas <= 10) {
				System.out.println("Tenistas que están en el top ten");
				System.out.println(tenistas);
				
			}
		}
	}
	
}
