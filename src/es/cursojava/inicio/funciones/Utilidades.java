package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class Utilidades {

    // Función pintaMenu
/*     public static void pintaMenu(String[] menuArr) {
        String mostrarMenu = "";
        for (int i = 0; i < menuArr.length; i++) {
            mostrarMenu = menuArr[i];
            System.out.println(mostrarMenu);
        }
    } */

    // Función que le pasamos un array de String y un texto de String
    public static void main(String[] menuArr, String texto) {
        for (String opcion : menuArr) {
            System.out.println(opcion);
        }
        System.out.println(texto);
    }
    
    // Función que le pamos un string "texto" y nos devuelve un valor numérico recogido por consola
    public static int pideDatoNumerico(String texto) {
        System.out.println(texto);
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        return numero;
    }

    public static int pideOpcion(String opcion) {
        System.out.println(opcion);
        Scanner scan = new Scanner(System.in);
        int opcionDevolver = scan.nextInt();
        return opcionDevolver;
    }

    // Función que le pamos un string "texto" y nos devuelve un String recogido por consola
    public static String pideDatoCadena(String texto) {
        System.out.println(texto);
        Scanner scan = new Scanner(System.in);
        String cadena = scan.nextLine();
        
        return cadena;
    }

}
