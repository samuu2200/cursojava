package es.cursojava.herencia.instrumentos;

public class Tambor extends Instrumentos{
    // Variable de instancia
    private String material;

    // Constructor
    public Tambor(String nombre, int tipo, boolean afinado, String material) {
        super(nombre, tipo, afinado);
        this.material = material;
    }

    // Getters & Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void afinar() {
        System.out.println("\n-Afinando el " + getNombre());
    }

    // Método exclusivo de tambor
    public void aporrear() {
        System.out.println("\t-El " + getNombre() + " se está aporreando");
    }
    
}
