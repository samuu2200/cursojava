package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int i;
		int c;
		
		int numUser = scan.nextInt();
		scan.close();
		
		for (i = 1, c = 1; i <= numUser * 10; i++, c = (i % 10 == 0 ? 10 : i % 10)) {
			System.out.print((i / 10 + 1) + " x " + c + " = " + ((i / 10 + 1) * c) + (c == 10 ? "\n" : "\t"));
			
		}
		
		
	}

}
