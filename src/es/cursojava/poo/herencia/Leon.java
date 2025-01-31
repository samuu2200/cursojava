package es.cursojava.poo.herencia;

public class Leon extends Animal {
    private boolean tieneMelena;

    public Leon(String nombre, double peso, boolean tieneMelena) {
        super(nombre, peso);
        this.tieneMelena = tieneMelena;
    }

    public void cazar() {
        System.out.println(getNombre() + " está cazando");
    } 
    
}
