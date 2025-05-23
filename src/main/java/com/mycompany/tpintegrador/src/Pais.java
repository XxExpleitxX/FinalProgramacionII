package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pais {

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
