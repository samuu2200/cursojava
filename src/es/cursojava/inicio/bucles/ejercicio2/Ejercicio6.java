package es.cursojava.inicio.bucles.ejercicio2;

//Cojetura Collatz
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Solicitamos un número al usuario
		System.out.print("Ingresa un número: ");
		int num = scan.nextInt();
		
		do { 
			
			if (num % 2 == 0) {
				num = num / 2;
				System.out.println(num);
			} else if (num % 2 != 0) {
				num = num * 3 + 1;
				System.out.println(num);

			}
			
			
		} while (num != 1);
	}
	
}
