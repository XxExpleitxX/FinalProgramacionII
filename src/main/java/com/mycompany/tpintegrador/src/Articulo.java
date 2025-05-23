package com.mycompany.tpintegrador.src;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Articulo {

    protected String denominacion;
    protected double precioVenta;
    protected UnidadMedida unidadMedida;
    protected Imagen imagen;

}
