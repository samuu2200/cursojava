package es.cursojava.inicio;

public class VariablesJava {
	//Variables de instancia 
	
	public static void main (String[] args) {
		//Variables locales
			//Tipos primitivos
			//Números enteros
			byte numeroSmall = 1; // -128 a 127
			short numeroMedium = 100; // -32.768 a 32.767
			int numero = 9; // -2^31 a 2^31-1.
			long numeroLong = 1000; // -2^63 a 2^63
			
			//Números decimales
			double numeroDecimal = 9.7;
			float numeroDecimal2 = 20.8f;
			
			//Caracteres
			char caracter = ' ';
			
			//Booleanos
			boolean esPar = true;
			boolean esImpar = false;
		
		//Variables de tipo objeto y arrays
			String nombre = "José Luis"; //Objeto
			
			int[] numeros = {0,1,2,3}; //Array
			
			//Declarar variables
				//Tipe --> el tipo de información que almacena
				//nombre --> nombre de la variable
				byte edad; //declarar una variable
				byte edadProfe = 18; //declarar e inicializar una variable
				
				
			System.out.println(nombre + ' ' + (edadProfe + 31));	
	}
}
