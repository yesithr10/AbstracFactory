package com.example.Taller1.dominio.abstractFactory.products;

public class MotorToyota extends Motor {
    public MotorToyota() {
        this.potenciaMaxima = 150.0;
        this.tecnologia = "Híbrido";
    }

    @Override
    public String getDescripcion() {
        return "Motor Toyota con " + potenciaMaxima + " HP y tecnología " + tecnologia + ".";
    }
}
