package es.cursojava.inicio.bucles.ejercicio2;

import java.util.Scanner;

//Solicitar por consola el número de alumnos en el aula y pedir para cada alumno su nota e indicar la media de todos los alumnos

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Solicitamos el número de alumnos
		System.out.print("Ingresa el número de alumnos: ");
		int alumnos = scan.nextInt();
		int nota = 0;
		
		for (int i = 0; i < alumnos; i++) {
			//Pedimos la nota para cada alumno
			System.out.print("Ingresa la nota para el alumno " + (i + 1) + "/" + alumnos + ": ");
			nota = scan.nextInt();
		}
		
		//Indicamos la nota media de todos los alumnos
		int media = alumnos * nota / 2;
		System.out.println("La nota media de todos los alumnos es: " + media);
		
	}

}
