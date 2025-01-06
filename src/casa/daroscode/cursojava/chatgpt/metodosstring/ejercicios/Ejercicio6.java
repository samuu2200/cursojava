package casa.daroscode.cursojava.chatgpt.metodosstring.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		
		System.out.print("Introduce la letra que quieras buscar: ");
		char busquedaLetra = scan.nextLine().charAt(0);
		
		if (texto.indexOf(busquedaLetra) != - 1) {
			//Significa que hay una coincidencia
			
			System.out.print("Introduce la letra que quieras reemplazar: ");
			char reemplazarLetra = scan.nextLine().charAt(0);
			
			String textoNuevo = texto.replace(busquedaLetra, reemplazarLetra);
			System.out.println("texto modificado: " + textoNuevo);
			
		} else {
			System.out.println("No hay ninguna coincidencia con la letra '" + busquedaLetra + "'");
		}
	}

}
