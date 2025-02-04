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
        int anoActual = this.ano - LocalDate.now().getDayOfYear();
        double calculoAno = 0;
        double calculoTipo = 0;
        double calculoVehiculo = 0;
        
            String tipoVehiculo = this.tipo;

            if (anoActual > 20) {
                calculoAno = (impuestoBase * 0.10);
            } else if (anoActual > 10) {
                calculoAno = (impuestoBase * 0.05);
            }
            
            if (tipoVehiculo.equalsIgnoreCase("Diesel") || tipoVehiculo.equalsIgnoreCase("Gasolina")) {
                calculoTipo = calculoAno + (impuestoBase * 0.10);
            } else if (tipoVehiculo.equalsIgnoreCase("Electrico")) {
                calculoTipo = calculoAno + (impuestoBase * 0.10);
            } else if (tipoVehiculo.equalsIgnoreCase("Hibrido")) {
                calculoTipo = calculoAno + (impuestoBase * 0.05);
            }
            
            if (this instanceof Camion) {
                calculoVehiculo = calculoAno + calculoTipo + impuestoBase + (impuestoBase * 0.10);
            } else if (this instanceof Coche) {
                calculoVehiculo = calculoAno + calculoTipo + impuestoBase + (impuestoBase * 0.05);
            } else if (this instanceof Motocicleta) {
                calculoVehiculo = calculoAno + calculoTipo + impuestoBase + (impuestoBase * -0.05);
            }

        double impuestoTotal = calculoVehiculo;
        System.out.print("** IMPUESTO TOTAL: ");
        System.out.println(impuestoTotal);
    }
}
