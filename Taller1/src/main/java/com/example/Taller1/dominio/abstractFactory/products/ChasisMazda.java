package com.example.Taller1.dominio.abstractFactory.products;

public class ChasisMazda extends Chasis {
    public ChasisMazda() {
        this.tipoTransmision = "Automática";
        this.noEjes = 4;
    }

    @Override
    public String getDescripcion() {
        return "Chasis Mazda con transmisión " + tipoTransmision + " y " + noEjes + " ejes.";
    }
}
