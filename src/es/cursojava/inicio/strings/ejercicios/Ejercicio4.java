package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario un String de varias palabras separadas por espacios
		System.out.print("Ingresa una cadena de texto con varias palabras separadas por espacios: ");
		String texto= scan.nextLine();
		
		String palabraLarga = "";
		int inicio = 0;
		
		//Recorrer las palabras
		while (inicio < texto.length()) {
			//Encontrar el siguiente espacio en blanco
			int fin = texto.indexOf(" ", inicio);
			
			//Si no hay más espacios usamos la longitud del texto
			if (fin == -1) {
				fin = texto.length();
			}
			
			//Extraer la palabra actual
			String palabra = texto.substring(inicio, fin);
			
			//Verificar si la palabra es más larga que la actual
			if (palabra.length() > palabraLarga.length()) {
				palabraLarga = palabra;
			}
			
			inicio = fin + 1;
		}
		
		System.out.println("La palabra más larga es: " + palabraLarga);
	}
	
}
