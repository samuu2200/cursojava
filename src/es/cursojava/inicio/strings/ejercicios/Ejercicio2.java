package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario el texto
		System.out.print("Introduce un texto para verificar si es un palíndromo: ");
		String texto = scan.nextLine();
		
		//3. Procesar el texto: eliminar espacios y convertir a minúsculas
		String textoProcesado = "";
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c != ' ') {
				if (c >= 'A' && c <= 'Z') {
					//convertimos mayúsculas en minúsculas
					c = (char) (c + 32);
				}
				textoProcesado += c;
			}
		}
		
		//4. Verificar si un texto es Palindromo o no
		boolean esPalindromo = true;
		int longitud = texto.length();
		for (int i = 0; i < longitud / 2; i++) {
			if (textoProcesado.charAt(i) != textoProcesado.charAt(longitud - 1 - i)) {
				esPalindromo = false;
				break;
			}
		}
		
		//5. Mostrar por consola el resultado
		if (esPalindromo) {
			System.out.println("El texto: " + textoProcesado + " es palindromo");
		} else {
			System.out.println("El texto: " + textoProcesado + " no es palindromo");
		}
		
	}
}
