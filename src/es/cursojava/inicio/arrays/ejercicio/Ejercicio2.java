package es.cursojava.inicio.arrays.ejercicio;

import java.util.Scanner;

<<<<<<< HEAD
public class Ejercicio2 {
	
	public static void main(String[] args) {
		
=======
/*1-Pedir número de alumnos
		  2-Crear array de String con el número de alumnos indicado
		  3-Pedir para cada alumno su nombre y guardarlo en el array
		  4-Mostrar el nombre de todos los alumnos
		  5-Mostrar el nombre de todos los alumnos que empiecen por A
 */

public class Ejercicio2 {
	
	public static void main(String[] args) {

>>>>>>> branch 'master' of https://github.com/samuu2200/cursojava.git
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce número de alumnos: ");
		int numAlumnos = scan.nextInt();
		scan.nextLine();
		String[]  nombresAlumnos = new String[numAlumnos];
		 
		
<<<<<<< HEAD
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
=======
		for (int i = 0; i < nombresAlumnos.length; i++) {
			System.out.println("Introduce nombre del alumno: ");
			nombresAlumnos[i] = scan.nextLine();
>>>>>>> branch 'master' of https://github.com/samuu2200/cursojava.git
		}
		
<<<<<<< HEAD
		// Mostrar todos los alumnos
		for (int i = 0; i < numAlumnos; i++) {

			System.out.println(alumnos[i]);
=======
		for (String nombre : nombresAlumnos) {
			System.out.println(nombre);
>>>>>>> branch 'master' of https://github.com/samuu2200/cursojava.git
		}
		
<<<<<<< HEAD
		//Mostrar números que empiezan por 'A'
		System.out.println("\nNombres que empiezan por 'A'");
		for (int i = 0; i < numAlumnos; i++) {
			if (alumnos[i].charAt(0) == 'A' || alumnos[i].charAt(0) == 'a') {
				System.out.println(alumnos[i]);
			}
		}
		
		scan.close();
=======
		System.out.println("Nombres que empiezan por 'A'");
		for (String nombre : nombresAlumnos) {
			if (nombre.toLowerCase().startsWith("a")) {
				System.out.println(nombre);
			}
		}
>>>>>>> branch 'master' of https://github.com/samuu2200/cursojava.git
	}

}
