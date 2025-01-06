package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		
		char primer = texto.charAt(0);
		char ultimo = texto.charAt(texto.length() - 1);
		
		
		System.out.println("Primer caracter es: " + primer + "\nÚltimo caracter es: " + ultimo);
	}

}
