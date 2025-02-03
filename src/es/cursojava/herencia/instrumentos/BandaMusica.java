package es.cursojava.herencia.instrumentos;

import java.util.Arrays;

public class BandaMusica {

    public static void main(String[] args) {
        BandaMusica banda = new BandaMusica();
        Instrumentos[] instrumentos = banda.crearIntrumentos();
        banda.empezarConcierto(instrumentos);
    }

    public Instrumentos[] crearIntrumentos() {
        Instrumentos guitarra = new Guitarra("Guitarrita", "pro", 4);
        Instrumentos guitarraElectrica = new Guitarra("Guitarra Electric", "proMax", 6);  
        Instrumentos piano = new Piano("Piano guapis", "Yamaha", 8, "Ultra");
        Instrumentos tambor = new Tambor("Tamborcito", "Globillo", "Madera");
        return new Instrumentos[] {guitarra, guitarraElectrica, piano, tambor};
    }

    public void empezarConcierto(Instrumentos[] instrumentos) {
        afinarConcierto(instrumentos);
        tocarInstrumentos(instrumentos);
    }

    public void afinarConcierto(Instrumentos[] instrumentos) {
        crearIntrumentos();
        System.out.println("===== AFINAR INSTRUMENTOS =====");
        System.out.println(Arrays.toString(instrumentos));
    }

    public void tocarInstrumentos(Instrumentos[] instrumentos) {
        for (Instrumentos instrumento : instrumentos) {
            if (instrumento instanceof Tambor) {
                ((Tambor)instrumento).aporrear();
            } else {
                instrumento.tocar();
            }
        }
    }

}
