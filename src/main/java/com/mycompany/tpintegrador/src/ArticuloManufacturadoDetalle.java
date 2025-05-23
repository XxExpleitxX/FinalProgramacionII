package com.mycompany.tpintegrador.src;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturadoDetalle {

    private int cantidad;
    private ArticuloInsumo insumo;
    private ArticuloManufacturado articuloManufacturado;

}
