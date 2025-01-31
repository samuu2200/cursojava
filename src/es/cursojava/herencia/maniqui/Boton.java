package es.cursojava.herencia.maniqui;

public class Boton extends Ropa {
    // Variables de instancia o propiedades
    private String tamanio;
    private String forma;

    // Constructor
    public Boton(String color, String tamanio, String forma) {
        super(color);
        this.tamanio = tamanio;
        this.forma = forma;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

}
