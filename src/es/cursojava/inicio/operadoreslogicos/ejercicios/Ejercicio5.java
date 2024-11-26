package es.cursojava.inicio.operadoreslogicos.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pon la temperatura actual en Celsius ");
		double c = scan.nextInt();
		
		System.out.println((c * 9 / 5) + 32);
		
		scan.close();
	}
	
}
