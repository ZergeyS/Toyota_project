package main.Models;

import main.Components.*;
import main.VehiclesTypes.Car;

import java.util.Arrays;

public class Camry extends Car {
    public Usb usb;

    public Camry(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                 Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
                 Wheel[] wheels, boolean cruisecontrolIsOn, Usb usb) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels, cruisecontrolIsOn);
        this.usb = usb;
    }

    public Usb getUsb() {
        return usb;
    }

    @Override
    public String toString() {
        return "Camry{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", gearbox=" + gearbox +
                ", isMoved=" + isMoved +
                ", price=" + price +
                ", engine=" + engine +
                ", electrics=" + electrics +
                ", headlights=" + headlights +
                ", fuelTank=" + fuelTank +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
