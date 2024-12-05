package es.cursojava.inicio.arrays.ejercicio;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String[] arrColores = new String[4];
		arrColores[0]= " azul";
		arrColores[1]= " amarillo";
		arrColores[2]= " verde";
		arrColores[3]= " marrón";
		
		for (int i = 0; i < arrColores.length; i++) {
			System.out.println (arrColores[i]);
		}
		
		String[] colores2 = {"Blanco, Negro"};
		
		for (String color : colores2) {
			System.out.println(color);
		}
		
		System.out.println("=====================================");
		
		
		//recorrer un arr con un for-each
		for (String color : arrColores) {
			System.out.println(color);
		}
	}

}
