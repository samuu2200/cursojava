package es.cursojava.inicio.operadoreslogicos.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		
		while(num1 <= 0 || num2 <= 0 ) {
			System.out.println("\nIntroduce datos mayores a 0\n");
			
			System.out.print("Introduce el primer número: ");
			num1 = scan.nextInt();
			
			System.out.print("Introduce el segundo número: ");
			num2 = scan.nextInt();
		}
			
			System.out.println("La suma de " + num1 + " + " + num2 + " es igual a: "  + (num1 + num2));
			System.out.println("La resta de " + num1 + " - " + num2 + " es igual a: " + (num1 - num2));
			System.out.println("La multiplicación de " + num1 + " * " + num2 + " es igual a: " + (num1 * num2));
			System.out.println("La división de " + num1 + " / " + num2 + " es igual a: " + (num1 / num2));
			
		
		scan.close();
		
		
	}

}

