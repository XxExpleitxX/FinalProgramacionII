package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Cliente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    private LocalDate fechaNacimiento;

    private Imagen imagen;
    private Usuario usuario;
    private Domicilio domicilio;

    private Set<Pedido> pedidos = new HashSet<>();
    private Set<Domicilio> domicilios = new HashSet<>();

    public Cliente(String nombre, String apellido, String telefono, String mail,
                   LocalDate fechaNacimiento, Imagen imagen, Usuario usuario, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.fechaNacimiento = fechaNacimiento;
        this.imagen = imagen;
        this.usuario = usuario;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", imagen=" + imagen +
                ", usuario=" + usuario +
                ", domicilio=" + domicilio +
                '}';
    }
}
