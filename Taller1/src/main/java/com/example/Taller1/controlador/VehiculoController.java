package com.example.Taller1.controlador;

import com.example.Taller1.dominio.abstractFactory.factories.FactoryToyota;
import com.example.Taller1.dominio.abstractFactory.factories.FactoryFord;
import com.example.Taller1.dominio.abstractFactory.factories.FactoryMazda;
import com.example.Taller1.dominio.Vehiculo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculoController {

    @GetMapping("/toyota")
    public Vehiculo.DetallesVehiculo crearVehiculoToyota() {
        FactoryToyota factoryToyota = new FactoryToyota();
        Vehiculo vehiculo = new Vehiculo(factoryToyota);
        return vehiculo.getDetalles();
    }

    @GetMapping("/ford")
    public Vehiculo.DetallesVehiculo crearVehiculoFord() {
        FactoryFord factoryFord = new FactoryFord();
        Vehiculo vehiculo = new Vehiculo(factoryFord);
        return vehiculo.getDetalles();
    }

    @GetMapping("/mazda")
    public Vehiculo.DetallesVehiculo crearVehiculoMazda() {
        FactoryMazda factoryMazda = new FactoryMazda();
        Vehiculo vehiculo = new Vehiculo(factoryMazda);
        return vehiculo.getDetalles();
    }
}
