package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce la nota del estudiante: ");
		int nota = scan.nextInt();
		
		scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del estudiante: ");
		String nombreAlumno = scan.nextLine();
		
		scan.close();
		
		switch (nota) {
		
		case 0,1,2,3,4 -> System.out.println("Suspenso");
		
		case 5,6 -> System.out.println("Aprobado");
		
		case 7,8 -> System.out.println("Notable");
		
		case 9, 10 -> System.out.println("Sobresaliente");
		
		}
		
	}


}
