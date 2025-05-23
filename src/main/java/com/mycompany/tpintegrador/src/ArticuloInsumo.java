package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticuloInsumo extends Articulo {

    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo(Imagen imagen, UnidadMedida unidadMedida, String denominacion,
                          double precioVenta, double precioCompra, int stockActual,
                          int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioVenta, unidadMedida, imagen);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    @Override
    public String toString() {
        return "ArticuloInsumo{" +
                "precioCompra=" + precioCompra +
                ", stockActual=" + stockActual +
                ", stockMaximo=" + stockMaximo +
                ", esParaElaborar=" + esParaElaborar +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", unidadMedida=" + unidadMedida +
                ", imagen=" + imagen +
                '}';
    }
}
