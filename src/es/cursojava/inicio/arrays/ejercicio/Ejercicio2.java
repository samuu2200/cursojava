package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir el número de usuario que quiere introducir
		System.out.print("Introduce el número de alumnos: ");
		int numAlumnos = scan.nextInt();
		scan.nextLine();
		
		//Crear una array para almacenar los nombres
		String[] alumnos = new String[numAlumnos];
		
		//Pedir los nombres de los alumnos y almacenarlos en el array
		for (int i = 0; i < numAlumnos; i++) {
			System.out.print("Introduce el nombre del alumno: " + (i + 1) + ": ");
			alumnos[i] = scan.nextLine();
		}
		
		// Mostrar todos los alumnos
		for (int i = 0; i < numAlumnos; i++) {

			System.out.println(alumnos[i]);
		}
		
		//Mostrar números que empiezan por 'A'
		System.out.println("\nNombres que empiezan por 'A'");
		for (int i = 0; i < numAlumnos; i++) {
			if (alumnos[i].charAt(0) == 'A' || alumnos[i].charAt(0) == 'a') {
				System.out.println(alumnos[i]);
			}
		}
		
		scan.close();
	}

}
