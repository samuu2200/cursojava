package es.cursojava.inicio.bucles.ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int esPar;
		int fuera = 99;
		
		for (esPar = 0; esPar <= 100; esPar += 2) {
			
			System.out.println(esPar + " - " + fuera);
			fuera-=2;
		}
		
		
	}
	
}
