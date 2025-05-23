package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Promocion {

    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private List<Articulo> articulos;

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta,
                     LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento,
                     Double precioPromocional, TipoPromocion tipoPromocion, List<Articulo> articulos) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.articulos = articulos;
    }
}
