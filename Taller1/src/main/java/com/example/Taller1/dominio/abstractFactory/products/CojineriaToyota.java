package com.example.Taller1.dominio.abstractFactory.products;

public class CojineriaToyota extends Cojineria {
    public CojineriaToyota() {
        this.materialBase = "Cuero";
    }

    @Override
    public String getDescripcion() {
        return "Cojinería Toyota de material " + materialBase + ".";
    }
}