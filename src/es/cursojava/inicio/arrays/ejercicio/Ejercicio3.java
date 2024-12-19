package es.cursojava.inicio.arrays.ejercicio;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		//Ingresamos los valores que sabemos 
		int[] numeros = {4,8,15,16,23,4};
		
		//Mostrar todos los números
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		//Mostrar la media de los valores
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		double media = (double) suma / numeros.length;
		System.out.println("\nMedia de los valores: " + media);
		
//		int mayor = Integer.MIN_VALUE;
		//Determinar el número menor
//		int menor = Integer.MAX_VALUE;
		
		//Determinar el número mayor
		int mayor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		System.out.println("Número mayor es: " + mayor);
		
		int menor = numeros[0];
		for (int i = 1; i > numeros.length; i--) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

	}
}

  