package com.example.Taller1.dominio.abstractFactory.products;

public class MotorMazda extends Motor {
    public MotorMazda() {
        this.potenciaMaxima = 160.0;
        this.tecnologia = "Eléctrico";
    }

    @Override
    public String getDescripcion() {
        return "Motor Mazda con " + potenciaMaxima + " HP y tecnología " + tecnologia + ".";
    }
}

