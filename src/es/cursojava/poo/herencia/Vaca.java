package es.cursojava.poo.herencia;

public class Vaca extends Animal {
    private int numCuernos;

    public Vaca(int numCuernos, String nombre, double peso) {
        super(nombre, peso);
        this.numCuernos = numCuernos;
    }

    public void mugir() {
        System.out.println("la vaca " + getNombre() + " está mugiendo");
    }
    
    @Override
    public void comer() {
        System.out.println("La vaca " + getNombre() + " está comiendo pasto");
    }
}
