package com.example.Taller1.dominio.abstractFactory.products;

public class ChasisFord extends Chasis {
    public ChasisFord() {
        this.tipoTransmision = "Manual";
        this.noEjes = 4;
    }

    @Override
    public String getDescripcion() {
        return "Chasis Ford con transmisión " + tipoTransmision + " y " + noEjes + " ejes.";
    }
}
