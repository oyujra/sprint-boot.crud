package com.jiska.jiskasoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Producto {
    @Id
    private String codigo;
    private String nombre;
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
