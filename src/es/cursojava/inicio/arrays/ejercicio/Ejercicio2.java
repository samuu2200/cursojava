package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;

/*1-Pedir número de alumnos
		  2-Crear array de String con el número de alumnos indicado
		  3-Pedir para cada alumno su nombre y guardarlo en el array
		  4-Mostrar el nombre de todos los alumnos
		  5-Mostrar el nombre de todos los alumnos que empiecen por A
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce número de alumnos: ");
		int numAlumnos = scan.nextInt();
		scan.nextLine();
		String[]  nombresAlumnos = new String[numAlumnos];
		 
		
		for (int i = 0; i < nombresAlumnos.length; i++) {
			System.out.println("Introduce nombre del alumno: ");
			nombresAlumnos[i] = scan.nextLine();
		}
		
		for (String nombre : nombresAlumnos) {
			System.out.println(nombre);
		}
		
		System.out.println("Nombres que empiezan por 'A'");
		for (String nombre : nombresAlumnos) {
			if (nombre.toLowerCase().startsWith("a")) {
				System.out.println(nombre);
			}
		}
	}

}
