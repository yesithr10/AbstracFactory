package com.example.Taller1.dominio;

import com.example.Taller1.dominio.abstractFactory.interfaces.IAbstractFactory;
import com.example.Taller1.dominio.abstractFactory.products.Chasis;
import com.example.Taller1.dominio.abstractFactory.products.Motor;
import com.example.Taller1.dominio.abstractFactory.products.Cojineria;

public class Vehiculo {
    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;

    public Vehiculo(IAbstractFactory factory) {
        this.chasis = factory.crearChasis();
        this.motor = factory.crearMotor();
        this.cojineria = factory.crearCojineria();
    }

    public DetallesVehiculo getDetalles() {
        return new DetallesVehiculo(
                chasis.getDescripcion(),
                motor.getDescripcion(),
                cojineria.getDescripcion()
        );
    }

    public static class DetallesVehiculo {
        private String chasis;
        private String motor;
        private String cojineria;

        public DetallesVehiculo(String chasis, String motor, String cojineria) {
            this.chasis = chasis;
            this.motor = motor;
            this.cojineria = cojineria;
        }

        public String getChasis() {
            return chasis;
        }

        public String getMotor() {
            return motor;
        }

        public String getCojineria() {
            return cojineria;
        }
    }
}

