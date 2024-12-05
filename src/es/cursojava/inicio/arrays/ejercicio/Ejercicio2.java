package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		/*1-Pedir número de alumnos
		  2-Crear array de String con el número de alumnos indicado
		  3-Pedir para cada alumno su nombre y guardarlo en el array
		  4-Mostrar el nombre de todos los alumnos
		  5-Mostrar el nombre de todos los alumnos que empiecen por A
		  */
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		String alumnStartA = "";
		String nameAlumn = "";
		
		do {
			System.out.print("Introduce los nombres de los alumnos: ");
			nameAlumn += scan.nextLine();
			i++;
		}while(i <= 5);
		
		if (nameAlumn.startsWith("a")) {
			
		}
		

		
	}

}
