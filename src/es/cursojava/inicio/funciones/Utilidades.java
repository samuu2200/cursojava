package es.cursojava.inicio.funciones;

import java.util.Scanner;

public class Utilidades {

    // Función pintaMenu
    public static void pintaMenu(String[] menuArr) {
        String mostrarMenu = "";
        for (int i = 0; i < menuArr.length; i++) {
            mostrarMenu = menuArr[i];
            System.out.println(mostrarMenu);
        }
    }
    
    public static int pideDatoNumerico(String texto) {
        System.out.println(texto);
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        scan.close();
        return numero;
    }

    public static String pideDatoCadena(String texto) {
        System.out.println(texto);
        Scanner scan = new Scanner(System.in);
        String cadena = scan.nextLine();
        
        scan.close();
        return cadena;
    }

}
