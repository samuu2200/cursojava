package es.cursojava.poo.vehiculos;

public class Camion extends Vehiculos {
    // Atributos
    private double capacidadCarga;
    private int numeroEjes;

    // Constructores
    public Camion(String marca, String modelo, int ano, double velocidadMaxima, String tipo, double capacidadCarga,
            int numeroEjes) {
        super(marca, modelo, ano, velocidadMaxima, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    // Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
     
    // Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("-Capacidad de carga: " + capacidadCarga + "\n"
                        + "-Número de ejes: " + numeroEjes);
    }
}
