package es.cursojava.inicio.operadores;

import java.util.Scanner;

//Conversión a grados Celsius a Fahrenheit

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir al usuario la temperatura en grados celsius
		System.out.print("Introduce los grados Celsius que quieras pasar a Fahrenheit: ");
		int temperatura = scan.nextInt();
		
		double fahrenheit = (double) temperatura * 9 / 5 + 32;
		//Convertir a fahrenheit
		System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + "º");
	}
	
}
