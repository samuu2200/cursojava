package casa.daroscode.cursojava.chatgpt;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Crea un programa que solicite al usuario el precio de un producto y el porcentaje de descuento. Calcula y muestra:
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir precio del producto/artico
		System.out.println("Introduce el precio del articulo o producto");
		double precio = scan.nextDouble();
		
		System.out.println("Introduce el descuento del articulo o producto");
		double descuento = scan.nextDouble();
		
		double precioConDescuento = (descuento / 100) * precio;
		
		System.out.println("El precio del articulo es: " + precio + " y el descuento es: " + descuento + "\n Total a pagar es: " + (precio - precioConDescuento));
		scan.close();
		
	
	}
	
	
}

