package cursojava.inicio.operadoreslogicos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = scan.nextInt();
		
		boolean esPar = num % 2 == 0;
		
		System.out.println(esPar);
		
		scan.close();
		
	}
	
}
