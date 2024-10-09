package com.example.Taller1.dominio.abstractFactory.products;

public class ChasisToyota extends Chasis {
    public ChasisToyota() {
        this.tipoTransmision = "Automática";
        this.noEjes = 4;
    }

    @Override
    public String getDescripcion() {
        return "Chasis Toyota con transmisión " + tipoTransmision + " y " + noEjes + " ejes.";
    }
}