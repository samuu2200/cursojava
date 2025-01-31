package es.cursojava.herencia.instrumentos;

public class GuitarraElectrica extends Guitarra{
    // Variable de instancia
    private double potencia;

    // Constructor que llama a al constructor de la clase padre
    public GuitarraElectrica(int numCuerdas, String nombre, int tipo, boolean afinado, double potencia) {
        super(numCuerdas, nombre, tipo, afinado);
        this.potencia = potencia;
    }

    // Getter & Setter
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * Sobreescribimos al método de la clase padre y la cambiamos por lo que ponga en la guitarra electrica
     */
    @Override
    public void tocar() {
        System.out.println("\t-El instrumento " + getNombre() + " está tocando muy alto");
    }
}
