package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario la de cadena de texto que quiere saber si es palindromo o no
		System.out.print("Introduce una cadena de texto: ");
		String texto = scan.nextLine();
		
		String textoPalindromo = "";
		for (int i = texto.length() - 1; i >= 0; i++) {
			textoPalindromo += texto.charAt(i);
		}
		

		
	}
}
