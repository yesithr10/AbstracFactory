package com.example.Taller1.dominio.abstractFactory.factories;

import com.example.Taller1.dominio.abstractFactory.interfaces.IAbstractFactory;
import com.example.Taller1.dominio.abstractFactory.products.*;

public class FactoryFord implements IAbstractFactory {

    @Override
    public Chasis crearChasis() {
        return new ChasisFord();
    }

    @Override
    public Motor crearMotor() {
        return new MotorFord();
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaFord();
    }
}
