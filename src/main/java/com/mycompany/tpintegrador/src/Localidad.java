package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Localidad {

    private String nombre;
    private Provincia provincia;

    public Localidad(Provincia provincia, String nombre) {
        this.provincia = provincia;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Localidad{" +
                "nombre='" + nombre + '\'' +
                ", provincia=" + provincia +
                '}';
    }
}
