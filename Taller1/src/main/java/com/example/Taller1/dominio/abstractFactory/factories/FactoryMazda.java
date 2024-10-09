package com.example.Taller1.dominio.abstractFactory.factories;

import com.example.Taller1.dominio.abstractFactory.interfaces.IAbstractFactory;
import com.example.Taller1.dominio.abstractFactory.products.*;


public class FactoryMazda implements IAbstractFactory {

    @Override
    public Chasis crearChasis() {
        return new ChasisMazda();
    }

    @Override
    public Motor crearMotor() {
        return new MotorMazda();
    }

    @Override
    public Cojineria crearCojineria() {
        return new CojineriaMazda();
    }
}
