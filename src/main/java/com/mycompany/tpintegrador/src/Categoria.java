package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
public class Categoria {

    private String denominacion;
    private Categoria categoriaPadre;
    private HashSet<Categoria> subCategorias = new HashSet<>();
    private HashSet<Articulo> articulos = new HashSet<>();

    public Categoria() {
    }

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria(String denominacion, Categoria categoriaPadre) {
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }
}
