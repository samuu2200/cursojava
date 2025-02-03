package es.cursojava.herencia.instrumentos;

public class GuitarraElectrica extends Guitarra{
    // Atributos
    private double potencia;

    // Constructores
    public GuitarraElectrica(String nombre, String tipo, int numeroCuerdas, double potencia) {
        super(nombre, tipo, numeroCuerdas);
        this.potencia = potencia;
    }

    public GuitarraElectrica(String nombre, String tipo, double potencia) {
        super(nombre, tipo);
        this.potencia = potencia;
    }

    // Getters y Setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public void tocar() {
        System.out.println("La " + getNombre() + " está tocando muy alto");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        super.toString();
        sb.append(super.toString());
        sb.append("Potencia : ").append(potencia);
        return sb.toString();
    }
}
