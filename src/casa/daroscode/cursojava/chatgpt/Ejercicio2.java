package casa.daroscode.cursojava.chatgpt;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Escribir un programa que pida la hora y transformarla a horas y minutos
		
		Scanner scan = new Scanner(System.in);
		
		//Pedimos la hora que queremos transformar
		System.out.print("Introduce la hora que quieras transformar a minutos y segundo: ");
		int hora = scan.nextInt();
		
		int minutos = hora * 60;
		int segundo = (hora * 3600);
		
		System.out.println(hora + " hora/s en minutos es: " + minutos);
		System.out.println(hora + " hora/s en segundo es: " + segundo);
		
		scan.close();
	}
	

}
