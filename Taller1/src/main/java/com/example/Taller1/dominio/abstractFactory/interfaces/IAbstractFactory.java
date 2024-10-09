package com.example.Taller1.dominio.abstractFactory.interfaces;

import com.example.Taller1.dominio.abstractFactory.products.Chasis;
import com.example.Taller1.dominio.abstractFactory.products.Motor;
import com.example.Taller1.dominio.abstractFactory.products.Cojineria;

public interface IAbstractFactory {
    Chasis crearChasis();
    Motor crearMotor();
    Cojineria crearCojineria();
}
