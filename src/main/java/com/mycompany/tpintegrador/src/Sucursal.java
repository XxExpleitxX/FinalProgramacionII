package com.mycompany.tpintegrador.src;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Sucursal {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Domicilio domicilio;

    private Set<Categoria> categorias = new HashSet<>();
    private Set<Promocion> promociones = new HashSet<>();

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                ", categorias=" + categorias +
                '}';
    }
}
