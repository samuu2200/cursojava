package casa.daroscode.cursojava.chatgpt;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		int num1 = scan.nextInt();
		
		System.out.println("Introduce el segundo número");
		int num2 = scan.nextInt();
		
		if (num1 < num2) {
			System.out.println("El número " + num1 + " es menor que " + num2);
			System.out.println("El número " + num2 + " es mayor que " + num1);
			
		}else if(num1 > num2) {
			System.out.println("El número " + num1 + " es mayor que " + num2);
			System.out.println("El número " + num2 + " es menor que " + num1);
		}else {
			System.out.println("Los números son iguales");
		}
		
		scan.close();
	}
	
}
