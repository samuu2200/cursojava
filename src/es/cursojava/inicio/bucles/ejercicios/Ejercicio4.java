package es.cursojava.inicio.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int i;
		int c;
		
		int numUser = scan.nextInt();
		
		for (i = 1, c = 1; (i <= numUser) && (c <= i && c <= 10)  ; i++,  c++) {
				int resultado = i * c;
				System.out.println(i + "x" + c + "=" + resultado);
			
		}
		
		
	}

}
