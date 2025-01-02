package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario un String para contar las vocales
		System.out.print("Ingresa un texto para contar cuántas vocales tiene: ");
		String texto = scan.nextLine().toLowerCase();
		
		
		//creamos una variable que vaya contando las vocales
		int contador = 0;
		int longitudTexto = texto.length() - 1;
		
		for (int i = 0; i < longitudTexto; i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
				contador++;
			}
				
		}
		
		System.out.println("El texto: " + texto + "\n tiene: " + contador + " vocales."); 
	}
}
