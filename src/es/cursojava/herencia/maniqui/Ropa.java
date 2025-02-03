package es.cursojava.herencia.maniqui;

public class Ropa {
    //Variables de instacia de la clase padre
    private String color;
    private double precio;
    private String talla;

    // Constructor
    public Ropa(String color, double precio, String talla) {
        this.color = color;
        this.precio = precio;
        this.talla = talla;
    }
 
    public Ropa(String color) {
        this.color = color;
    }

    // Getters & Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
}
