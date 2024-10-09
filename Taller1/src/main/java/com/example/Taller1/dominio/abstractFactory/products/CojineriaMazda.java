package com.example.Taller1.dominio.abstractFactory.products;

public class CojineriaMazda extends Cojineria {
    public CojineriaMazda() {
        this.materialBase = "Sintético";
    }

    @Override
    public String getDescripcion() {
        return "Cojinería Mazda de material " + materialBase + ".";
    }
}
