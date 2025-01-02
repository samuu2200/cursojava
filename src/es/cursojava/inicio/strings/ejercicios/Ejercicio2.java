package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	
		 //Pedimos al usuario el texto
		 System.out.print("Introduce un texto o palabra palíndromo: ");
		 String texto = scan.nextLine();
		 
		 //Procesamos el texto por si contiene espacios y para convertirlo en minúsculas
		 String textoProcesado = "";
		 for (int i = 0; i < texto.length() - 1; i++) {
			 char c = texto.charAt(i);
			 if (c != ' ') {
				 if (c <= 'A' && c >= 'Z') {
					 c = (char) + (c + 32);
				 }
				 textoProcesado += c;
			 }
		 }
		 
		 //Ahora necesitamos recorrer el texto y comparar cada caracter
		 boolean esPalindromo = true;
		 int longitud = textoProcesado.length()	- 1;
		 
		 for (int i = 0; i < longitud / 2; i++) {
			 if (textoProcesado.charAt(i) != textoProcesado.charAt(longitud - i)) {
				esPalindromo = false;
				break;
			 }
		 }
		 
		 //Mostrar por pantalla el resultado
		if (esPalindromo) {
			System.out.println("-El texto es palíndromo" + textoProcesado);
		} else {
			System.out.println("-El texto no es palíndromo");
		}
		 
	}
}
