package es.cursojava.inicio.pruebacasa;

import java.util.Scanner;

public class EjercicioMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int option ;
		
		do {
			System.out.println("***** Menú *****");
			System.out.println("1. Pintar Triángulo");
			System.out.println("2. Validar Email");
			System.out.println("3. Añadir Alumno");
			System.out.println("4. Salir");
			System.out.println("Eligue una opción");
	
			option = scan.nextInt();
			scan.nextLine();
			switch (option) {
			case 1 :
				//Pintar Triángulo
				System.out.println("Introduce la altura del arbolito\n");
				int arbolito = scan.nextInt();
				
				for (int i = 1; i <= arbolito; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case 2 : 
				//Validar Email
				System.out.println("Introduce el Email a válidar:\n");
				boolean valido = true;
				String errores = "";
				String email = scan.nextLine().trim().toLowerCase();
				
				
				//Debe tener solo una arroba
				int countArroba = 0;
				for (int i = 0; i < email.length(); i++) {
					if (email.charAt(i) == '@') countArroba++;
				}
				if (countArroba != 1) {
					errores += "- Debe tener exactamente una '@'.\n";
					valido = false;
				}
				
				//No puede tener espacios en blanco
				if (email.contains(" ")) {
					errores += "- No debe tener espacios en blanco\n";
					valido = false;
				}
				
				//Después de la @ tiene que haber al menos un punto
				int posicionArroba = email.indexOf('@');
				int posicionUltPunto = email.lastIndexOf('.');
				if (posicionUltPunto < posicionArroba || posicionUltPunto == -1) {
					errores += "-Debe ver un punto después de la '@'\n";
					valido = false;
				}
				
				//Punto antes de la '@'
				int posicionPuntoAntesArroba = email.lastIndexOf('.', posicionArroba - 1);
				if (posicionPuntoAntesArroba != -1 && posicionUltPunto > posicionArroba) {
					errores += "- No puede ver un punto antes de la '@' y después\n";
					valido = false;
				}
				
				//Entre la '@' y el primer punto debe haber al menos 2 caracteres
				if (posicionUltPunto > posicionArroba && posicionUltPunto - posicionArroba <= 2) {
					errores += "- Debe haber dos caracteres después de la '@' y del último punto\n";
					valido = false;
				}
				
				//Después del último punto solo puede haber entre 2 y 6 caracteres
				int caracteresDespuesPunto = email.length() - posicionUltPunto -1;
				if (caracteresDespuesPunto < 2 || caracteresDespuesPunto > 6) {
					errores += "- Debe haber más de 2 y menos que 6 caracteres después del punto\n";
					valido = false;
				}
				
				if (valido == true) {
					System.out.println("El correo es válido");
					System.out.println(email);
				} else {
					System.out.println("Correo inválido. Revisa los siguientes errores: \n" + errores);
				}
				break;
			case 3 : 
				System.out.println("Añadir Alumno");
				break;
			case 4 :
				System.out.println("Adioooos!");
				break;
			default:
				System.out.println("Opción inválida. Intentalo otra vez");
			}
			
			
		} while (option != 4);
		
	}
	
}
