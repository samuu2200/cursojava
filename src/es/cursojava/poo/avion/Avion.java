package es.cursojava.poo.avion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Avion {
    private int numTurbinas;
    private String marca;
    private int capacidad;
}
