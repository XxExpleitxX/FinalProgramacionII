package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Empresa {

    private String nombre;
    private String razonSocial;
    private int cuit;

    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa(String nombre, String razonSocial, int cuit) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public void addSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public void removeSucursal(Sucursal sucursal) {
        sucursales.remove(sucursal);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit=" + cuit +
                ", sucursales=" + sucursales +
                '}';
    }
}
