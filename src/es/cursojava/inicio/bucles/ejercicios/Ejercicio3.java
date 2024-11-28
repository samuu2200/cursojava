package es.cursojava.inicio.bucles.ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int esPar;
		int esImpar;
		
		for (esPar = 0; esPar <= 100; esPar += 2) {
			
			if(esPar % 2 != 0) {
				
				System.out.println(esPar + "-" + esPar);
			}
			
		}
		
		
	}
	
}
