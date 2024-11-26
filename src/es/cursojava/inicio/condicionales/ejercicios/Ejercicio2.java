package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//pedir al usuario un número que queramos resolver
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		
		
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("+ " + " - " + " * " + " " + " /" + " ¿Cúal eligues?: ");
		
		String pedirOperacion = scan2.nextLine();
		
		scan.close();
			
		if(pedirOperacion.equals("+")) {
			System.out.println("La resta de " + num1 + " + " + num2 + " es igual a: " + (num1 + num2));
			
		}else if(pedirOperacion.equals("-")) {
			System.out.println("La resta de " + num1 + " - " + num2 + " es igual a: " + (num1 - num2));
			
		}else if(pedirOperacion.equals("*")) {
			System.out.println("La multiplicación de " + num1 + " * " + num2 + " es igual a: " + (num1 * num2));
			
		}else if(pedirOperacion.equals("/")) {
			System.out.println("La división de " + num1 + " / " + num2 + " es igual a: " + (num1 / num2));
		}
		
		scan.close();
	}
	
}
