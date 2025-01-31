package es.cursojava.herencia.maniqui;

public class Camisa extends Ropa{
    private Boton[] btns;

    // Constructor
    public Camisa(String color, double precio, String talla, Boton[] btns) {
        super(color, precio, talla);
        this.btns = btns;
    }
    
    // Botón
    public Boton[] getBtns() {
        return btns;
    }
    public void setBtns(Boton[] btn) {
        this.btns = btn;
    }

    // Metodo mostrar Botones
    public void mostrarBotones(Boton[] btns) {
        int contador = 0;
        for (Boton botones : btns) {
            contador++;
            System.out.println("Botón " + contador + ":");
            System.out.println("\tColor botón: " + botones.getColor());
            System.out.println("\tForma botón: " + botones.getForma());
            System.out.println("\tTamaño botón: " +botones.getTamanio());
        }
    }
}
