package es.cursojava.poo.vehiculos;

public class PruebaVehiculos {

    public static void main(String[] args) {
        PruebaVehiculos mainVehiculos = new PruebaVehiculos();
        Vehiculos[] vehiculos = mainVehiculos.crearVehiculos();
        mainVehiculos.mostrarInformacion(vehiculos);
    }
    
    // Método donde se inicializan todos los vehiculos
    public Vehiculos[] crearVehiculos() {
        Vehiculos cocheAntiguo = new Coche("Mercedes", "Clase A", 2000, 120, "Gasolina", 2, false);
        Vehiculos coche = new Coche("Ford", "Fiesta", 2010, 120, "Diesel", 4, true);
        Vehiculos cocheElectrico = new Coche("BMW", "S1", 2019, 170, "Electrico", 4, true);
        Vehiculos motocicleta = new Motocicleta("Honda", "R1", 2024, 240, "Gasolina", false, 1000);
        Vehiculos motocicletaHibrido = new Motocicleta("Harley Davidson", "Chopper", 2030, 140, "Hibrido", false, 500);
        Vehiculos camion = new Camion("Silver", "Gold", 2015, 100, "Diesel", 450, 4);
        return new Vehiculos[] {cocheAntiguo, coche, cocheElectrico, motocicletaHibrido, motocicleta, camion};
    }

    // Métodos donde mostramos toda la información e impuestos de los vehiculos
    public void mostrarInformacion(Vehiculos[] vehiculos) {
        for (Vehiculos vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            vehiculo.calcularImpuesto();
        }
    }
}
