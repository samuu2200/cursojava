package casa.daroscode.cursojava.chatgpt;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		int month = 0;
		int month31 = 31;
		int month30 = 30;
		int febrary = 28;
		
		Scanner scan = new Scanner(System.in);
		
		//Pedir número de un mes
		System.out.println("Introduce un mes del 1 al 12");
		month = scan.nextInt();
		
		switch (month) {
		case 1,3,5,7,8,10,12 -> System.out.println(month31);
		
		case 2 -> System.out.println(febrary);
		
		case 4,6,9,11 -> System.out.println(month30);
		}
		
		scan.close();
	}
	
}
