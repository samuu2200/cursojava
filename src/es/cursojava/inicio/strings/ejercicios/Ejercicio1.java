 package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario el texto que queremos invertir
		System.out.print("Introduce el texto que quieras invertir ");
		String texto = scan.nextLine();

		char textoInvertido ;
		
		for (int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido = texto.charAt(i);
			System.out.print(textoInvertido);
		}
	}
}
