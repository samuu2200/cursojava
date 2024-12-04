package es.cursojava.inicio.strings.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*Escribe un programa que reciba un String y devuelva el texto invertido.*/
		
		String text = "Samuel";
		int textInvertido = text.length();
		
		for (int i = textInvertido-1; i >= 0; i--) {
			
			char j = text.charAt(i);
			
			System.out.print(j);
		}
	}
	
}
