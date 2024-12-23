package es.cursojava.inicio.operadores;

import java.util.Scanner;

/*Ejercicio 2: Comparar dos números*/

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir al usuario dos números para comparar si es mayor o menor
		System.out.print("Introduce el primer dato: ");
		int num1 = scan.nextInt();
		
		System.out.print("\nIntroduce el segundo dato: ");
		int num2 = scan.nextInt();
		
		
		//Comparamos si el primer número es mayor, menor o igual al segundo
		
		if (num1 > num2) {
			System.out.println("\n-El número " + num1 + " es mayor que " + num2);
		} else if (num2 > num1) {
			System.out.println("\n-El número " + num2 + " es mayor que " + num1);
		} else {
			System.out.println("\n- Los números son iguales");
		}
	}
	
}
