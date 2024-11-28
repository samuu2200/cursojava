package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i <= 10; i++) {

			int num = scan.nextInt();
			
			if (num % 3 == 0) {
				System.out.println(num + "- multiplo de 3");
				
			}else if (num % 5 == 0) {
				System.out.println(num + "- multiplo de 5");
			}
			
		}		
		scan.close();
	}

	
}
