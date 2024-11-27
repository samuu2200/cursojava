package es.cursojava.inicio.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int edad = 0;
		int experiencia = 0;
		String clasificacionPorEdad = "";
		String clasificacionPorExperiencia = "";
		String sectorDeEmpresa = "";
		
		//Pedimos la edad del empleado
		System.out.println("Qué edad tiene el empleado: ");
		edad = scan.nextInt();
		
		
		//Clasificación por edad
		if (edad <= 18) {
			clasificacionPorEdad = "Becario";
			
		}else if (edad > 18 && edad <= 35) {
			clasificacionPorEdad = "Veterano";
		}
		
		System.out.println("El empleado es: " + clasificacionPorEdad + "\n");
				
		//Pedimos los años de experiencia
		System.out.println("Cúantos años de experiencia tiene el empleado: ");
		experiencia = scan.nextInt();
		
		if(experiencia < 2) {
			
			if (edad >= 18 && edad <= 35) {
				clasificacionPorExperiencia = "Especialista";
				
			}else if (edad < 18) {
				clasificacionPorExperiencia = "Junior";
				
			}
			
		}else {
			
			if (edad > 18 && edad < 35) {
				clasificacionPorExperiencia = "Senior";
				
			}
			if (edad >= 35) {
				clasificacionPorExperiencia = "Experto";
			}
			
		}
		
		System.out.println("El empleado es: " + clasificacionPorExperiencia + "\n");
		
		//Pedimos el sector de la empresa
		System.out.println("¿Qué sector eres?, (Departamento TI, Recursos Humanos, Ventas) ");
		scan.nextLine();//consumimos el salto de línea
		sectorDeEmpresa = scan.nextLine();
		
		String clasificacionPorSector = "";

		if (sectorDeEmpresa.equalsIgnoreCase("Departamento Ti") && edad >= 5) {
			clasificacionPorSector = "Tech lead";
			
		}else if (sectorDeEmpresa.equalsIgnoreCase("Recursos Humanos") && (edad > 1 && edad < 5)) {
			clasificacionPorSector = "Gestor De Personasa";
			
		}else if (sectorDeEmpresa.equalsIgnoreCase("Ventas") && edad < 1) {
			clasificacionPorSector = "Asistente En Ventas \n";
		}
		
		System.out.println("El empleado es: " + clasificacionPorSector + " y tiene " + clasificacionPorEdad + clasificacionPorExperiencia);
		
		scan.close();
		
		
		

	}

}
