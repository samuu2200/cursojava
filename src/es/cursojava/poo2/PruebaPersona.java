package es.cursojava.poo2;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona p = new Persona("samuel", "Quintero", "34342423l", 39);
        System.out.println(p.getNombre());
        System.out.println(p.getPeso());
        p.correr();

        Persona p1 = new Persona("duban", "gutierrez", "234234k", 89);
        
        System.out.println(p1.getNombre());
        System.out.println(p1.getPeso( )); 
        p1.correr();
        //persona0.peso = 70.5;
    }

}
