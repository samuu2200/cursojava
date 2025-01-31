package es.cursojava.herencia.instrumentos;

public class Piano extends Instrumentos {
    // Variables de instancia
    private int numeroOctavas;
    private int tipoPiano;

    // Constructor que llama al constructor de la clase padre
    public Piano(String nombre, int tipo, boolean afinado, int numeroOctavas, int tipoPiano) {
        super(nombre, tipo, afinado);
        this.numeroOctavas = numeroOctavas;
        this.tipoPiano = tipoPiano;
    }

    // Getters & Setter
    public int getNumeroOctavas() {
        return numeroOctavas;
    }

    public void setNumeroOctavas(int numeroOctavas) {
        this.numeroOctavas = numeroOctavas;
    }

    public int getTipoPiano() {
        return tipoPiano;
    }

    public void setTipoPiano(int tipoPiano) {
        this.tipoPiano = tipoPiano;
    }

    // Métodos
    public void afinar() {
        super.afinar();
        System.out.println("\n-Afinando el " + getNombre());
    }
    
}
