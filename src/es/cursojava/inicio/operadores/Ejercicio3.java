package es.cursojava.inicio.operadores;

import java.util.Scanner;

/*Calculadora Básica*/

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos al usuario las operaciones que quiera realizar
		System.out.print("Introduce el primer número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int num2 = scan.nextInt();
		scan.nextLine();
		
		//Solicitamos al usuario la operación que quiera realizar
		System.out.print("Introduce el operador que quieras utilizar para el calculo: ");
		System.out.println("+	-	*	/");
		String operador = scan.nextLine();
		
		switch (operador) {
			case "+" :
				int suma = num1 + num2;
				System.out.println("-El resultado es: " + suma);
				break;
				
			case "-" : 
				int resta = num1 - num2;
				System.out.println("-El resultado es: " + resta);
				break;
				
			case "*" :
				int multiplicacion = num1 * num2;
				System.out.println("-El resultado es: " + multiplicacion);
				break;
				
			case "/" : 
				int division = num1 / num2;
				System.out.println("-El resultado es: " + division);
				break;
				
			default : System.out.println("Opción incorrecta. Vuelve a intentarlo");
		}
	}
	
}
