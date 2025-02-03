package es.cursojava.herencia.instrumentos;

public class Piano extends Instrumentos {
    // Atributos
    private int numeroOctavas;
    private String tipoPiano;

    // Constructores
    public Piano(String nombre, String tipo, int numeroOctavas, String tipoPiano) {
        super(nombre, tipo);
        this.numeroOctavas = numeroOctavas;
        this.tipoPiano = tipoPiano;
    }

    // Getter y Setters
    public int getNumeroOctavas() {
        return numeroOctavas;
    }

    public void setNumeroOctavas(int numeroOctavas) {
        this.numeroOctavas = numeroOctavas;
    }

    public String getTipoPiano() {
        return tipoPiano;
    }

    public void setTipoPiano(String tipoPiano) {
        this.tipoPiano = tipoPiano;
    }
    
    @Override
    public void tocar() {
        super.tocar();
        System.out.println("tAfinando " + getNombre());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        super.toString();
        sb.append(super.toString());
        sb.append("Tipo de piano: ").append(tipoPiano);
        sb.append("Número de octavas: ").append(numeroOctavas);
        return sb.toString();
    }
}
