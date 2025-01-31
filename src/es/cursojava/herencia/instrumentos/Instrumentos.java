package es.cursojava.herencia.instrumentos;

public class Instrumentos {
    // Variables de instancia de la clase padre
    private String nombre;
    private int tipo;
    private boolean afinado;

    // Constructor
    public Instrumentos(String nombre, int tipo, boolean afinado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.afinado = afinado;
    }
    public Instrumentos() {
    }


    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    /**
     * Método que le nos muestra si un instrumento está afinado o no
     */
    public void afinar() {
        System.out.println("\n-Afinando instrumento: " + nombre);
        if (Math.random() > 0.4) {
            afinado = true;
        } else {
            afinado = false;
        }

        if (!afinado) {
            System.out.println("\t-El instrumento " + this.nombre + " no ha podido ser afinado");
        } else {
            System.out.println("\t-El instrumento " + this.nombre + " ha sido afinado");
        }
    }

    public void tocar() {
        System.out.println("\t-El instrumento " + getNombre() + " ha empezado a tocar");
    }

}
