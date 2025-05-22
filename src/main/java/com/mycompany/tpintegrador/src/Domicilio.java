package com.mycompany.tpintegrador.src;

public class Domicilio {

    private String calle;
    private int numero;
    private int cp;

    private Localidad localidad;

    public Domicilio() {
    }

    public Domicilio(String calle, int numero, int cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp=" + cp +
                ", localidad=" + localidad +
                '}';
    }
}
