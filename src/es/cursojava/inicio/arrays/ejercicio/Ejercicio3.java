package es.cursojava.inicio.arrays.ejercicio;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Meter los valores en un array
		int[] numeros = {4,8,15,16,23,42};

		int suma = 0;
		for (int numero : numeros) {
			suma = numero + suma;
		}
		
		int media = suma / numeros.length;
		
		System.out.println(media);
		
		
		
	}
	
}
  