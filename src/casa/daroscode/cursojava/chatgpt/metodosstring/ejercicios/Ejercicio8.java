 package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
	       Scanner scan = new Scanner(System.in);

	       System.out.print("Introduce un texto: ");
	       String texto = scan.nextLine();
	       
	       texto = texto.trim();
	       
	       int contador = 0;
	       
	       while (texto.indexOf(" ") != -1) {
	    	   int posicionEspacio = texto.indexOf(" ");
	    	   
	    	   String palabra = texto.substring(0, posicionEspacio);
	    	   
	    	   contador++;
	    	   
	    	   texto = texto.substring(posicionEspacio + 1);
	       }
	       
	       if (!texto.isEmpty()) {
	    	   contador++;
	       }
	       
	       System.out.println("El texto tiene: " + contador + " palabras.");
	}
	
}
