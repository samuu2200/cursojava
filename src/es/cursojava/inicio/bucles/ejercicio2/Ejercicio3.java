package es.cursojava.inicio.bucles.ejercicio2;

import java.util.Scanner;

//Mostrar tablas de multiplicar hasta el número que se solicite

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Solicitamos al usuario hasta que número quiere las tablas de multiplicar
		System.out.print("Introduce el número que quieras solicitar de la tabla: ");
		byte num = scan.nextByte();
		
		//recorremos los número con un iterador hasta que llegue al número 10
		for (int i = 1; i <= num; i++) {
			System.out.println("\ntablas del " + i);
			for (int c = 1; c <= 10; c++) {
				System.out.println(i + "x" + c + "=" + (c * i)); 
			}
		}
		
	}
	
}
