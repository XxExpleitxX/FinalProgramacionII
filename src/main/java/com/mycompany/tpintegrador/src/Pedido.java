package com.mycompany.tpintegrador.src;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido {

    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Set<DetallePedido> DetallePedidos;

    public Pedido() {
        this.DetallePedidos = new HashSet<>();
    }

    private Factura factura;

    private Domicilio domicilio;

    private Sucursal sucursal;

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Factura factura, Domicilio domicilio, Sucursal sucursal) {
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

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
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
