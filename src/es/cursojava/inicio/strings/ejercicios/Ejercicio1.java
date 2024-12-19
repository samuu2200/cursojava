 package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Solicitamos al usuario el texto que quiera invertir
		System.out.println("Introduce el texto que quieras invertir:");
		String texto = scan.nextLine();
		
		//Creamos una variable de textoInvertido
		String textoInvertido = "";
		
		//Recorremos el texto desde la última posición hasta el principio
		for (int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		//Mostramos por consola el resultado
		System.out.println("texto invertido: " + textoInvertido);
	}
}
