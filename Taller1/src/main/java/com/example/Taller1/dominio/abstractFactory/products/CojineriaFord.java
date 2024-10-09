package com.example.Taller1.dominio.abstractFactory.products;

public class CojineriaFord extends Cojineria {
    public CojineriaFord() {
        this.materialBase = "Tela";
    }

    @Override
    public String getDescripcion() {
        return "Cojinería Ford de material " + materialBase + ".";
    }
}
