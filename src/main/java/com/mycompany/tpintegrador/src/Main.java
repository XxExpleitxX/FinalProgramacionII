package com.mycompany.tpintegrador.src;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------");

        Pais pais1 = new Pais("Argentina");
        Provincia provincia1 = new Provincia("Mendoza", pais1);
        Localidad localidad1 = new Localidad(provincia1, "Malargue");
        Provincia provincia2 = new Provincia("Buenos Aires", pais1);
        Localidad localidad2 = new Localidad(provincia2, "Caballito");

        Domicilio domicilioSuc = new Domicilio("Zapata", 568, 5500, localidad1);
        System.out.println(domicilioSuc);

        //-----------------------------------------------------------------------

        Usuario usuario1 = new Usuario("D123", "Dario");
        Imagen imagenCliente = new Imagen("www.gmail.com");
        Domicilio domicilioCl = new Domicilio("Aguirre", 1350, 5539, localidad1);
        Domicilio domicilioCl2 = new Domicilio("25 de mayo", 1750, 6539, localidad2);
        Cliente clienteA = new Cliente("Juan Dario", "Sinatra", "4378258", "JDS@gmail.com", LocalDate.of(1985, 9, 17), imagenCliente, usuario1, domicilioCl);
        System.out.println(clienteA);
        Cliente clienteB = new Cliente("Matias ", "Martinez", "4388359", "MM@gmail.com", LocalDate.of(2004, 9, 26), imagenCliente, usuario1, domicilioCl);
        System.out.println(clienteB);
        //------------------------------------------------------------------------

        Imagen imagenInsumo = new Imagen("www.gmail/lm.com");
        UnidadMedida unidadMedidaUni = new UnidadMedida("Unidades");
        ArticuloInsumo articuloInsumo1 = new ArticuloInsumo(imagenInsumo, unidadMedidaUni, "Salchicha", 0, 50.0, 300, 300, true);
        ArticuloInsumo articuloInsumo2 = new ArticuloInsumo(imagenInsumo, unidadMedidaUni, "Pan Hamburguesa", 5, 70.0, 300, 300, true);

        System.out.println(articuloInsumo1);
        System.out.println(articuloInsumo2);
        //------------------------------------------------------------------------

        Categoria categoriaA = new Categoria("Comidas Rapidas");
        Sucursal sucursalCentro = new Sucursal("Sucursal Centro", LocalTime.of(10, 30, 0), LocalTime.of(23, 30, 0), domicilioSuc);
        Sucursal sucursalBA = new Sucursal("Sucursal BA", LocalTime.of(10, 30, 0), LocalTime.of(23, 30, 0), domicilioCl);
        System.out.println(sucursalCentro);
        System.out.println(sucursalBA);

        //----------------------------------------------------------------------

        Empresa empresaComidas = new Empresa("Comete Todo!!", "Empresa de produccion y venta de alimentos", 211445588);
        empresaComidas.addSucursal(sucursalCentro);
        empresaComidas.addSucursal(sucursalBA);
        System.out.println(empresaComidas);

        //-------------------------------------------------------------------------

        Factura factura001 = new Factura(LocalDate.now(), 10001, 0001001, "mp100", "mp1001", FormaPago.MERCADO_PAGO, 25000.5);
        Factura factura002 = new Factura(LocalDate.now(), 10002, 0002002, "mp200", "mp2002", FormaPago.MERCADO_PAGO, 30000.5);
        Pedido pedido01 = new Pedido(LocalTime.of(21, 30), 28000, 20000, Estado.PREPARACION, TipoEnvio.DELIVERY, FormaPago.MERCADO_PAGO, LocalDate.now(), factura001, domicilioCl, sucursalCentro);
        Pedido pedido02 = new Pedido(LocalTime.of(23, 30), 30000, 40000, Estado.PREPARACION, TipoEnvio.DELIVERY, FormaPago.MERCADO_PAGO, LocalDate.now(), factura002, domicilioCl2, sucursalBA);
        System.out.println(pedido01);
        System.out.println(pedido02);


    }


}