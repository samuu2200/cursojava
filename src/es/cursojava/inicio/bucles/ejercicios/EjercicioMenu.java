package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce la opción en número que quieres elegir: (1.Pintar Cuadro, 2.Validar email, 3.Añadir Alumno, 4.Salir): ");
		int opcion = scan.nextInt();
		final int OPCION_SALIR = 4;
		
		do {
			
			switch (opcion) {
				case 1 :
					
					System.out.println("Introduce el tamaño del cuadrado ");
					int size = scan.nextInt();
					
					for (int row = 0; row < size; row++) {
						
						for (int col = 0; col < size; col++) {
							
							if (row == 0 || row == size -1 || col == 0 || col == size -1) {
								System.out.print(" * ");
							}else {
								System.out.print("   ");
							}
							
						}
						System.out.println();
						
					}
					
				
				case 2 :
					
				
				case 3 : System.out.println();
				case 4 : System.out.println();
				default : System.out.println();
				
			}
			
		}while (opcion != OPCION_SALIR);
		
	}
	
}
