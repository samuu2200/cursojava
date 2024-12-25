package es.cursojava.inicio.bucles.ejercicio2;

//Mostrar los números del 2 al 100 y al mismo tiempo los impares

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int pares = 2;
		int impares = 99;
		//recorremos los números pares del 2 al 100
		for (int i = pares; i <= 100; i+=2) {
			pares = i;
			if (impares >= 0) {
				impares -= 2;
			}
			System.out.println(pares + "-" + impares);
		}
		
	}
	
}
