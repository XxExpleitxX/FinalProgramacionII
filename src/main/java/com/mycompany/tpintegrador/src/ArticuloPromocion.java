package com.mycompany.tpintegrador.src;

public class ArticuloPromocion {
    private Promocion promocion;
    private Articulo articulo;
    private int cantidad;

    public ArticuloPromocion() {
    }

    public ArticuloPromocion(Promocion promocion, Articulo articulo, int cantidad) {
        this.promocion = promocion;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
