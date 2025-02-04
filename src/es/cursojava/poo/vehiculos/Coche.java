package es.cursojava.poo.vehiculos;

public class Coche extends Vehiculos{
    // Atributos
    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    // Constructor
    public Coche(String marca, String modelo, int ano, double velocidadMaxima, String tipo, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, ano, velocidadMaxima, tipo);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    // Getters & Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    
    // Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("-Numero de puertas: " + numeroPuertas + "\n "
                         + "-Tiene aire Acondicionado: " + (tieneAireAcondicionado ? "Sí" : "No"));
    }
}
