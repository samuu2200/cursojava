package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class EjercicioMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce la opción en número que quieres elegir: (1.Pintar Cuadro, 2.Validar email, 3.Añadir Alumno, 4.Salir): ");
		String pintarMenu = scan.nextLine();
		
		do {
			
			if (pintarMenu.equals("1")) {
				System.out.println("Pintar Cuadro");
				System.out.println("Introduce un número del cuadro");
				int number = scan.nextInt();


		        for (int width = 0; width < number; width++) { 
		            for (int heigth = 0; heigth < number; heigth++) { 
		                
		                if (width == 0 || width == number - 1 || heigth == 0 || heigth == number - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  "); 
		                }
		            }
		            System.out.println();
		        }

				
				
			}else if (pintarMenu.equals("2")) {
				System.out.println("Validar Email");
				
			}else if (pintarMenu.equals("3")) {
				System.out.println("Añadir Alumno");
				
			}else if (pintarMenu.equals("4")) {
				System.out.println("ADIOS!");
				
				break;
			}else {
				System.out.println("Error");
			}
			
		}while(pintarMenu.equals("4"));
		
	}
	
}
