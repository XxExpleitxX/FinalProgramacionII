package com.mycompany.tpintegrador.src;

public class ArticuloManufacturadoDetalle {
    private int cantidad;
    private ArticuloInsumo insumo;
    private ArticuloManufacturado articuloManufacturado;

    public ArticuloManufacturadoDetalle() {
    }

    public ArticuloManufacturadoDetalle(int cantidad, ArticuloInsumo insumo, ArticuloManufacturado articuloManufacturado) {
        this.cantidad = cantidad;
        this.insumo = insumo;
        this.articuloManufacturado = articuloManufacturado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(ArticuloInsumo insumo) {
        this.insumo = insumo;
    }

    public ArticuloManufacturado getArticuloManufacturado() {
        return articuloManufacturado;
    }

    public void setArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {
        this.articuloManufacturado = articuloManufacturado;
    }
}