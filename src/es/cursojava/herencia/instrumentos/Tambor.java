package es.cursojava.herencia.instrumentos;

public class Tambor extends Instrumentos{
    // Atributos
    private String material;

    // Constructores
    public Tambor(String nombre, String tipo, String material) {
        super(nombre, tipo);
        this.material = material;
    }

    // Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void afinar() {
        setAfinado(true);
        System.out.println("-El " + getNombre() + " está afinado");
    }

    public void aporrear() {
        System.out.println("-El " + getNombre() + " se está aporreando");
    }
    
    
}
