package es.cursojava.inicio.bucles.ejercicio2;

import java.util.Scanner;

//Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		for (byte i = 0; i < 10; i++) {
			System.out.print("Introduce el número " + (i + 1) + ": ");
			int num = scan.nextInt();
			
			//Saber si es multiplo de 5 y 3
			if (num % 5 == 0) {
				System.out.print(num + " Es multiplo de 5");
			} else if (num % 3 == 0) {
				System.out.print(num +"Es multiplo de 3");
			}
		}
		
	}
	
}
