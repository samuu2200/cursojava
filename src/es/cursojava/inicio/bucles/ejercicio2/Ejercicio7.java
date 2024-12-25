package es.cursojava.inicio.bucles.ejercicio2;

// Solicitar por consola el número de números de la serie de fibonacci
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Solicitamos el número de la serie al usuario
		System.out.println("Ingresa el número de la serie de la fibonacci");
		int serie = scan.nextInt();
		
		if (serie <= 0) {
			System.out.println("El número debe ser mayor que el número 0");
		} else {
			int a = 0, b = 1;
			for (int i = 0; i < serie; i++) {
				int c = a + b;
				a = b;
				b = c;
				System.out.print(a + ",");
			}
		}
		
		
	}
	
	
}
