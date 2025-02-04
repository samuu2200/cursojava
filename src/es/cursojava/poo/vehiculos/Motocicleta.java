package es.cursojava.poo.vehiculos;

public class Motocicleta extends Vehiculos {
    // Atributos
    private boolean tieneSidecar;
    private int cilindrada;

    // Constructor
    public Motocicleta(String marca, String modelo, int ano, double velocidadMaxima, String tipo, boolean tieneSidecar,
            int cilindrada) {
        super(marca, modelo, ano, velocidadMaxima, tipo);
        this.tieneSidecar = tieneSidecar;
        this.cilindrada = cilindrada;
    }

    // Getters y Setters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Métodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("-Tiene sidecar: " + (tieneSidecar ? "Sí" : "No") + "\n"
                        + "-Cilindrada: " + cilindrada);
    }

}
