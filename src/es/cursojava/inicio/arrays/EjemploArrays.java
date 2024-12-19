package es.cursojava.inicio.arrays;

public class EjemploArrays {

	public static void main(String[] args) {
		
		int [] numeros = new int[6];
		
		System.out.println(numeros[0]);
		System.out.println(numeros[5]);
		
		String[] colores = new String[2];
		System.out.println(colores[0]);
		
		numeros[1]=8;
		System.out.println(numeros[1]);
		
		numeros[1]=5;
		System.out.println(numeros[1]);
		numeros[1]=3;
		System.out.println(numeros[1]);
		
		for (int numero : numeros) {
			System.out.println(numero);
		}

	}

}
