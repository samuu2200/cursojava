package es.cursojava.herencia.instrumentos;

public class Instrumentos {
    // Atributos
    private String nombre;
    private String tipo;
    private boolean afinado;

    // Constructores
    public Instrumentos(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }


    public void afinar() {
        afinado = Math.random() > 0.4;
        if (afinado) {
            System.out.println("-El instrumento " + nombre + " está afinado");
        } else {
            System.out.println("-El instrumento " + nombre + " no está afinado");
        }
    }

    public void tocar() {
        System.out.println("\tEl instrumento " + nombre + " está siendo tocado");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del instrumento: ").append(nombre);
        sb.append("Tipo de instrumentos: ").append(tipo);
        sb.append("Afinado: ").append(afinado);
        return sb.toString();
    }
    
}
