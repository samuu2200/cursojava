package es.cursojava.inicio.operadores;

//Verificar si un número es par o impar

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir al usuario un número entero
		System.out.print("Introduce un número entero: ");
		int num = scan.nextInt();
		
		//Verificar si el número es par o impar
		if (num % 2 == 0) {
			System.out.println(num + " es par");
		} else {
			System.out.println(num + " es impar");
		}
	}
	
}
