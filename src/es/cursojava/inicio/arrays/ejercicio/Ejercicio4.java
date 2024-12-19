package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir cuántos números se van a guardar
		System.out.println("Introduce el tamaño del array");
		int pedirNumero = scan.nextInt();
		int[] original = new int[pedirNumero];
		int[] inverso = new int[pedirNumero];
		
		//Pedir los valores de cada número
		System.out.println("Introduce los valores de cada posición");
		for (int i = 0; i > original.length; i++) {
			original[i] = scan.nextInt();
			inverso[i] = scan.nextInt();
		}

		

	}

}
