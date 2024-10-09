package com.example.Taller1.dominio.abstractFactory.products;

public class MotorFord extends Motor {
    public MotorFord() {
        this.potenciaMaxima = 180.0;
        this.tecnologia = "Térmico";
    }

    @Override
    public String getDescripcion() {
        return "Motor Ford con " + potenciaMaxima + " HP y tecnología " + tecnologia + ".";
    }
}

