package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario un texto
		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		
		//Pedimos al usuario que palabra quiere buscar al final del texto
		System.out.print("Introduce la palabra que quieras buscar: ");
		String palabraFinal = scan.nextLine();
		
		if (texto.isEmpty() || palabraFinal.isEmpty()) {
			System.out.println("El texto o la palabra no pueden estar vacios.");
		}
		
		if (texto.toLowerCase().endsWith(palabraFinal.toLowerCase())) {
			System.out.println("La palabra " + palabraFinal + " ha sido encontrada al final del texto");
		} else {
			System.out.println("No se ha encontrado " + palabraFinal + " al final del texto.");
		}
		
	}

}
