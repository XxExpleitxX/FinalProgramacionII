package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private HashSet<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public ArticuloManufacturado(String denominacion, double precioVenta, UnidadMedida unidadMedida,
                                 Imagen imagen, String descripcion, Integer tiempoEstimadoMinutos,
                                 String preparacion) {
        super(denominacion, precioVenta, unidadMedida, imagen);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }
}




