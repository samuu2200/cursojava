package es.cursojava.inicio.strings.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario la cadena que quiere invertir
		System.out.print("Introduce la cadena de texto que quieres invertir: ");
		String texto = scan.nextLine();
		
		//Recorremos la cadena de texto con un bucle para después invertirlo
		String textoInvertido = "";
		for (int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}
		
		//Mostramos por consola el resultado
		System.out.println(textoInvertido);
		
	}
}
