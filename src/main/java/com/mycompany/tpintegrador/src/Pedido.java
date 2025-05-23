package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Pedido {

    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Set<DetallePedido> DetallePedidos = new HashSet<>();

    private Factura factura;
    private Domicilio domicilio;
    private Sucursal sucursal;

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto,
                  Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido,
                  Factura factura, Domicilio domicilio, Sucursal sucursal) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.factura = factura;
        this.domicilio = domicilio;
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", factura=" + factura +
                ", domicilio=" + domicilio +
                ", sucursal=" + sucursal +
                '}';
    }
}
