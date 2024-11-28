package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota = Math.random() * 10;
		int numAlumnos = 0;
		System.out.print("Introduce el número de alumnos en el aula: ");
		numAlumnos = scan.nextInt();
		
		if(nota > 5) {
			System.out.println(nota);
		}
		
	}

	
}
