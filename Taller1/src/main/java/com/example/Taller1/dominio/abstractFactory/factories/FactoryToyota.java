package com.example.Taller1.dominio.abstractFactory.factories;

import com.example.Taller1.dominio.abstractFactory.interfaces.IAbstractFactory;
import com.example.Taller1.dominio.abstractFactory.products.*;

public class FactoryToyota implements IAbstractFactory {

    @Override
    public Chasis crearChasis() {
        return new ChasisToyota();
    }

    @Override
    public Motor crearMotor() {
        return new MotorToyota();
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaToyota();
    }
}

