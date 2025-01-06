package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		
		System.out.print("Introduce el caracter: ");
		char caracter = scan.nextLine().charAt(0);
		
		int contadorCaracteres = 0;
		
		for (int i = 0; i <= texto.length() - 1; i++) {
			if (texto.charAt(i) == caracter) {
				contadorCaracteres++;
			}
		}
		
		System.out.println("El caracter '" + caracter + "' aparece " + contadorCaracteres + (contadorCaracteres != 1 ? " veces" : " vez"));
		
	}

}
