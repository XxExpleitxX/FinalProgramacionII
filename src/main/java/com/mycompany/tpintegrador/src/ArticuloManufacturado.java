package com.mycompany.tpintegrador.src;

import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;

    private HashSet<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new HashSet<>();

    public ArticuloManufacturado(String denominacion , double precioventa , UnidadMedida unidadMedida, Imagen imagen, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion , precioventa , unidadMedida, imagen);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }





}
