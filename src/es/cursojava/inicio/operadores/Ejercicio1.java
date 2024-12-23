package es.cursojava.inicio.operadores;

import java.util.Scanner;

/*Ejercicio 1: Calcular el área de un rectángulo*/

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos la base y la altura del rectángulo para saber su área
		System.out.print("\nIntroduce la base del rectangulo: ");
		short base = scan.nextShort();
		
		System.out.print("\nIntroduce la altura del rectángulo: ");
		short altura = scan.nextShort();
		
		//Guardamos en una variable la multiplicación de la base * altura
		int area = (base * altura);
		
		//Mostramos por consola
		System.out.println("\nEl área del rectángulo es: " + area);
	}
	
}
