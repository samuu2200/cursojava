package es.cursojava.inicio.buclesfor;

public class Explicacion {

	public static void main(String[] args) {
		
		int num = 5;
		
//		for (int i = 0; i <= 10; i++) {
//			int resultado = i * 5;
//			
//			if (resultado % 2 == 0) {
//				System.out.println(num + "x" + i + "=" + resultado);
//			}
//		}
		
		//Instrucción continua
//		for (int i = -0; i < 10; i++) {
//			
//			System.out.println("Entra " + i);
//			
//			if (i % 2 == 0) {
//				continue;
//			}
//			System.out.println("pasa");
//			System.out.println(i);
//			
//		}
		
		//Instrucción break
		for (int i = -0; i < 10; i++) {
			
			System.out.println("Entra " + i);
			
			if (i % 2 == 0) {
				break;
			}
			System.out.println("pasa");
			System.out.println(i);
			
		}
	}
	
}
