package cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		//Pedimos al usuario la duracion
		System.out.print("Introduce la duración de la llamada en minutos: ");
		int duracion = scan.nextInt();
		
		//Pedimos el día de la semana 
//		System.out.print("Introduce el día de la semana: (lunes, martes..) ");
//		scan.nextLine();//consumimos el salto de línea
//		String dia = scan.nextLine().toLowerCase();
		
		//Pedimos la hora
//		System.out.println("Introduce la hora del día, por ejemplo (las 3pm serían las 15) ");
//		int hora = scan.nextInt();
		
		double costoBase = 0;
		
		if (duracion > 0 && duracion <= 5) {
			System.out.println(costoBase = 1.0);
			
		}else if (duracion > 5 && duracion <= 8) {
			System.out.println(costoBase = 1.0 + (duracion - 5) * 0.80);
			
		}else if (duracion > 8 && duracion <= 10) {
			System.out.println(costoBase = 1.0 + (3 * 0.80) + (duracion - 8) * 0.70);
		
		}else if (duracion > 10) {
			System.out.println(costoBase = 1.0 + (3 * 0.80) + (2 * 0.70) + (duracion - 10) * 0.50);
		}
		
		
	}
	
}
