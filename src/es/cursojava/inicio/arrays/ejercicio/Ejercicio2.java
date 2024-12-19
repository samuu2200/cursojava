package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;


public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir número de alumnos
		System.out.print("Introduce el número de alumnos: ");
		int numAlumnos = scan.nextInt();
		scan.nextLine();
		
		//Crear array de String con el número de alumnos indicado
		String[] alumnos = new String[numAlumnos];
		
		//Pedimos el nombre del alumno y guardamos en el array
		for (int i = 0; i < numAlumnos; i++) {
			System.out.print("Introduce el nombre del alumno: " + (i + 1) + ": ");
			alumnos[i] = scan.nextLine();
		}
		
		//Mostrar el nombre de todos los alumnos
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		
		//Mostrar el nombre de los alumnos que empiezan por 'A'
		System.out.println("Alumnos que empiezan por 'a' son: ");
		for (int i = 0; i <  alumnos.length; i++) {
			String alumnosStartWidthA = "";
			if (alumnos[i].charAt(0) == 'A' || alumnos[i].charAt(0) == 'a') {
				alumnosStartWidthA = alumnos[i];
				System.out.println(alumnosStartWidthA);
			}
		}
	}

}
	
