package es.cursojava.poo.herencia;

public class Zoologico {


    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico();
        zoo.abrirZoo();        
        
    }

    private void abrirZoo() {
        Leon leon = new Leon("Mufasa", 190, true);
        leon.comer();
        leon.beber();
        leon.cazar();

        Vaca vaca = new Vaca(2, "Lola", 150);
        vaca.mugir();
        vaca.comer();

        Animal vaca1 = new Vaca(2, "MuuuVaca", 200);
        vaca1.comer();
        //vaca1.mugir(); no se puede la clase Animal no tiene mugir

        Animal leon1 = new Leon("Leonidas", 332, true);
        
        // Con esto ya decimos a java que esto en una vaca con un "cast"
        Vaca vaca2 = (Vaca)vaca1;
        vaca2.mugir();
    }

}
