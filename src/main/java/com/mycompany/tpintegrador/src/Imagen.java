package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Imagen {

    private String denominacion;

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
