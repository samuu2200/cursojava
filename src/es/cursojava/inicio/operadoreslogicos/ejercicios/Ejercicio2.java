package es.cursojava.inicio.operadoreslogicos.ejercicios; 

	import java.util.Scanner;
	
	public class Ejercicio2 {
	
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Introduce un número entero: ");
			int num1 = scan.nextInt();
			
			System.out.print("Introduce otro número: ");
			int num2 = scan.nextInt();
			
			if (num1 < num2) {
				System.out.println("El número " + num1 + " es menor que " + num2);
				System.out.println("El número " + num2 + " es mayor que " + num1);
			}else if (num2 < num1) {
				System.out.println("El número " + num2 + " es menor que " + num1);
				System.out.println("El número " + num1 + " es menor que " + num2);
			}else {
				System.out.println("El número " + num1 + " es igual que el " + num2);
			}
			
			scan.close();
		
		}

}
