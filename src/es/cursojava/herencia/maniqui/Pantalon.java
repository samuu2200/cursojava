package es.cursojava.herencia.maniqui;

public class Pantalon extends Ropa{
    private Boton btn;

    public Pantalon(String color, double precio, String talla, Boton btn) {
        super(color, precio, talla);        
        this.btn = btn;
    }

    // Botón
    public Boton btn() {
        return btn;
    }
    public void btn(Boton btn) {
        this.btn = btn;
    }

    public String toString() {
        String padre = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalon").append(padre);
        sb.append("Botón").append(btn);
        return sb.toString();
    }
}
