package com.mycompany.tpintegrador.src;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloPromocion {

    private Promocion promocion;
    private Articulo articulo;
    private int cantidad;

}
