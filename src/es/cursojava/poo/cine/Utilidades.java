package es.cursojava.poo.cine;

import java.util.Scanner;

public class Utilidades {
    
    public static int pideDatoNumerico(String texto) {
        System.out.println(texto);
        Scanner scan = new Scanner(System.in);

        int teclado = scan.nextInt();
        return teclado;
    }

}
