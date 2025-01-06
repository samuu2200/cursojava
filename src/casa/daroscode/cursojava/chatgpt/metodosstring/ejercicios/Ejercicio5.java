package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		
		String textoMayusculas = texto.toUpperCase();
		String textoMinusculas = texto.toLowerCase();
		
		System.out.println("Texto en minúsculas: " + textoMinusculas + "\nTexto en mayúsculas: " + textoMayusculas);
		
	}
	
}
