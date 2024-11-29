package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int numAlumnos = 0;
		int pedirNota;
		
		System.out.print("Cuantos Alumnos hay en classe: ");
		numAlumnos = scan.nextInt();
		
		for (int alumnos = 0; alumnos <= numAlumnos; alumnos++) {
			
			for (pedirNota = 0; pedirNota <= alumnos; pedirNota++) {
				
				String sinplu = (numAlumnos > 1) ? " los " : " el ";
				String sinplu2 = (numAlumnos > 1) ? " alumnos " : " alumno ";
				System.out.print("Ingresa la nota de" + sinplu + numAlumnos + sinplu2);
				pedirNota = scan.nextInt();
				
				System.out.println(alumnos + " nota: " + pedirNota);
			}
			
		}
		
	}
	
}
