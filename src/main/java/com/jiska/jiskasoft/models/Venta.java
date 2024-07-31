package com.jiska.jiskasoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Venta {
    @Id
    private Long id;
    private String emp;
    private String clien;
    private String prod;
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getClien() {
        return clien;
    }

    public void setClien(String clien) {
        this.clien = clien;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
