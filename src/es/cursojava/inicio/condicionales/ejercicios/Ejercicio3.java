package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 2 3 4: ");
		int menuIndex = scan.nextInt();
		
		switch (menuIndex) {
		case 1:
			System.out.println("Pintar cuadro");
			break;
		case 2: 
			System.out.println("Validar Email");
			break;
		case 3: 
			System.out.println("Añadir alumno");
			break;
		case 4: 
			System.out.println("Adios!");
			break;
			default: System.out.println("Opción incorrecta");
		}
		
		System.out.println("Has escogido la opción " + menuIndex);
		
		scan.close();
	}
	
}
