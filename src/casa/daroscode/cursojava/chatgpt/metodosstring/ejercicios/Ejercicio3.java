package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un texto: ");
		String texto = scan.nextLine();
		System.out.print("Introduce la palabra que quieras buscar dentro del texto: ");
		String palabra = scan.nextLine();
		
		if (texto.contains(palabra)) {
			System.out.println(palabra + " ha sido encontrada con exito!");
		} else {
			System.out.println("Error: palabra no encontrada.");
		}
		

	}

}
