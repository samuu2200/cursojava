package es.cursojava.herencia.instrumentos;

public class Guitarra extends Instrumentos {
    // Variable de instancia
    private int numCuerdas;

    // Constructor que llama al constructor de la clase padre
    public Guitarra(int numCuerdas, String nombre, int tipo, boolean afinado) {
        super(nombre, tipo, afinado);
        this.numCuerdas = numCuerdas;
    }
    // Getter & Setters
    public int getNumCuerdas() { 
        return numCuerdas;
    }
    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }    

    /**
     * Llamamos al método de la clase padre y ampliamos su función
     */
    public void afinar() {
        super.afinar();
        System.out.println("\nAfinando " + getNombre());
    }

}
