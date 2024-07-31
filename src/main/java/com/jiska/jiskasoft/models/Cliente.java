package com.jiska.jiskasoft.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    private String nit;
    private String apellido;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
