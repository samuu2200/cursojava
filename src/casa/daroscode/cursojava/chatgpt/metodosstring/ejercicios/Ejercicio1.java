package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un texto para saber su longitud: ");
		String texto = scan.nextLine();
		int longitud = texto.length();
		
		System.out.println(longitud);
		
	}
	
}
