package cursojava.inicio.operadoreslogicos.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Intruduce la base del rectangulo: ");
		int base = scan.nextInt();
		
		System.out.print("Introduce la altura del rectangulo: ");
		int altura = scan.nextInt();
		
		System.out.println("El área del rectangulo es: " + (base * altura));
		
		
		scan.close();
		
		
	}
	
	
	
}
