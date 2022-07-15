package main.VehiclesTypes;

import main.Components.*;
import main.Vehicle;

public abstract class Car extends Vehicle {
    private boolean cruisecontrolIsOn;

    public Car(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
               Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
               Wheel[] wheels, boolean cruisecontrolIsOn) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels);
        this.cruisecontrolIsOn = cruisecontrolIsOn;
    }
    public void cruisecontrolOn() {
        if (cruisecontrolIsOn) {
            System.out.println("Круиз-контроль уже включен");
        } else {
            cruisecontrolIsOn = !cruisecontrolIsOn;
            System.out.println("Кключаем круиз-контроль");
        }
    }

    public void cruisecontrolOff() {
        if (!cruisecontrolIsOn) {
            System.out.println("Круиз-контроль уже выключен");
        } else {
            cruisecontrolIsOn = !cruisecontrolIsOn;
            System.out.println("Выключаем круиз-контроль");
        }
    }

    public void isCruisecontrolIsOn() {
        if (cruisecontrolIsOn) {
            System.out.println("Круиз-контроль включен");
        } else {
            System.out.println("Круиз-контроль выключен");
        }
    }
}
