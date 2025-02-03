package es.cursojava.herencia.instrumentos;

public class BandaMusica {

    public static void main(String[] args) {
        // Objeto bandaMusica
        BandaMusica bandaMusica = new BandaMusica();

        bandaMusica.empezarConcierto();
    }

    private void empezarConcierto() {
        // Objeto guitarra
        Instrumentos guitarra = new Guitarra(6, "Guitarra", 1, true);
        // Objeto guitarra electrica
        Instrumentos guitarraElectrica = new GuitarraElectrica(4, "Guitarra Electrica", 5, false, 120.05);
        // Objeto piano
        Instrumentos piano = new Piano("Piano", 3, true, 8, 4);
        // Objeto tambor
        Instrumentos tambor = new Tambor("Tambor", 9, true, "Madera");

        Tambor tambor2 = (Tambor) tambor;

        Instrumentos[] instrumentos = {guitarra, guitarraElectrica, piano, tambor2};

        afinarInstrumentos(instrumentos);

        tocarInstrumentos(instrumentos);
    }

    public void afinarInstrumentos(Instrumentos[] instrumentos) {
        System.out.println("***************************");
        System.out.println("-Los instrumentos se están afinando");
        for (int i = 0; i < instrumentos.length; i++) {
            if (instrumentos[i].isAfinado()){
                instrumentos[i].afinar();
            }
        }
        System.out.println("***************************");
    }

    public void tocarInstrumentos(Instrumentos[] instrumentos) {
        System.out.println("\n***************************");
        System.out.println("-Los instrumentos han empezado a tocar");
        for (Instrumentos instrumento : instrumentos) {
            instrumento.tocar();
        }
        System.out.println("***************************");
    }

    

}
