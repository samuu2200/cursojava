package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		do {
			
			System.out.println("**** MENÚ ****");
			System.out.println("1. Pintar Cuadro");
			System.out.println("2. Validar Email");
			System.out.println("3. Añadir Alumno");
			System.out.println("4. Salir");
			System.out.println("Elige una opción:");
			option = scan.nextInt();
			scan.nextLine();
			
			if (option == 1) {
				//Pintar Cuadro
				System.out.println("Introduce el tamaño del cuadrado\n");
				int size = scan.nextInt();
				
				if (size < 1) {
					System.out.println("El tamaño del cuadrado debe ser mayor a 1");
				} else {
					for (int width = 1; width <= size; width++) {
						for (int height = 1; height <= size; height++) {
							if (width == 1 || width == size || height == 1 || height == size) {
								System.out.print("* ");
							} else {
								System.out.print("  ");
							}
						}
						System.out.println();
					}
				}
			} else if (option == 2) {
				//Validar Email
				System.out.println("Introduce el email a validar:\n");
				String email = scan.nextLine();
				
				//Acumulamos los mensajes de error
				StringBuilder errores = new StringBuilder();
				
				//Verificar que tenga solo una @
				int countArrobas = 0;
				for (int i = 0; i < email.length(); i++) {
					if (email.charAt(i) == '@') countArrobas++; 
				}
				if (countArrobas != 1) {
					errores.append("- El email debe contener exactamente un '@'\n");
				}
				
				//Verificar que tenga espacios en blanco
				if (email.contains(" ")) {
					errores.append("- El email no puede contener espacios en blanco\n");
				}
				
				//Verificar posiciones
				int posicionArroba = email.indexOf('@');
				int posicionUltPunto = email.lastIndexOf('.');
				int posicionPuntoAntesArroba = email.lastIndexOf('.', posicionArroba - 1);
				
				if (posicionUltPunto < posicionArroba || posicionUltPunto == -1) {
					errores.append("- El email debe contener un punto después de la '@'\n");
				}
				if (posicionPuntoAntesArroba != -1 && posicionUltPunto > posicionArroba) {
					errores.append("- El email no puede tener un punto antes la '@' y después\n");
				}
				//Verificar que después de la @ hayan al menos 2 caracteres
				if (posicionUltPunto > posicionArroba + 1 && posicionUltPunto - posicionArroba <= 2) {
					errores.append("- El email debe tener al menos dos caracteres después de la '@'\n");
				}
				
				//Verificar que después del punto solo hayan más de 2 y menos que 6 caracateres
				int caracteresDespuesPunto = email.length()	- posicionUltPunto - 1;
				if (caracteresDespuesPunto < 2 || caracteresDespuesPunto > 6) {
					errores.append("- El email debe tener más de 2 y menos que 6 caracteres después del punto.\n");
				}
				
				//Mostrar por consola
				if (errores.length() == 0) {
					System.out.println("El email es válido");
				} else {
					System.out.println("El email es inválido");
					System.out.println(errores.toString());
				}
				
				
			} else if (option == 3) {
				//Añadir Alumno
				
			} else if (option == 4) {
				//Salir del menú
				
			} else {
				
			}
			
		} while (option != 4);
		
		scan.close();
		
	}

}
