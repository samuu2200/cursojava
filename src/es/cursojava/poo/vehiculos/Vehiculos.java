package es.cursojava.poo.vehiculos;

import java.time.LocalDate;

public class Vehiculos {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadMaxima;
    private String tipo;

    // Constructor
    public Vehiculos(String marca, String modelo, int ano, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    // Getters & Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN " + marca + " ===");
        System.out.println("-Marca: " + marca + "\n "
                + "-Modelo: " + modelo + "\n "
                + "-Año: " + ano + "\n "
                + "-Velocidad máxima: " + velocidadMaxima + "\n "
                + "-Tipo: " + tipo);
    }
    /*
     * public void mostrarInformacion() {
     * StringBuilder sb = new StringBuilder();
     * sb.append("-Marca: ").append(marca);
     * sb.append("-Modelo: ").append(modelo);
     * sb.append("-Año: ").append(ano);
     * sb.append("-Velocidad máxima: ").append(velocidadMaxima);
     * sb.append("-Tipo: ").append(tipo);
     * sb.toString();
     * }
     */

    // Método calcular impuesto
    public void calcularImpuesto() {
        int impuestoBase = 200;
        int antiguedad = this.ano - LocalDate.now().getYear();
        double calculoAno = 0;
        double calculoTipo = 0;
        double calculoVehiculo = 0;
        

        
        double impuestoTotal = calculoVehiculo;
        System.out.print("** IMPUESTO TOTAL: ");
        System.out.println(impuestoTotal);
    }
}
