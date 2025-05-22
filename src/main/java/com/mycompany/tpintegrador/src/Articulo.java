package com.mycompany.tpintegrador.src;

public abstract class Articulo {

    protected String denominacion;
    protected double precioVenta;

    protected UnidadMedida unidadMedida;

    protected Imagen imagen;


    public Articulo(String denominacion, double precioVenta, UnidadMedida unidadMedida, Imagen imagen) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
        this.imagen = imagen;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
}
