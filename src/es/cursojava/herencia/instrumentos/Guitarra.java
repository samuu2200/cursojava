package es.cursojava.herencia.instrumentos;

public class Guitarra extends Instrumentos {

    private int numeroCuerdas;

    // Constructor
    public Guitarra(String nombre, String tipo, int numeroCuerdas) {
        super(nombre, tipo);
        this.numeroCuerdas = numeroCuerdas;
    }

    public Guitarra(String nombre, String tipo) {
        super(nombre, tipo);
        this.numeroCuerdas = 4;
    }

    // Getter y Setter
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("\t-Afinando " + getNombre());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        super.toString();
        sb.append(super.toString());
        sb.append("Número de cuerdas: ").append(numeroCuerdas);
        return sb.toString();
    }
}
