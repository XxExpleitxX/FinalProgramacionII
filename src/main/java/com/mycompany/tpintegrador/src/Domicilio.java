package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Domicilio {

    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;

    public Domicilio(String calle, int numero, int cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp=" + cp +
                ", localidad=" + localidad +
                '}';
    }
}
