package main.VehiclesTypes;

import main.Components.*;
import main.Vehicle;

public abstract class Truck extends Vehicle {
    private int maxLoadCapacity;

    public Truck(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                 Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
                 Wheel[] wheels, int maxLoadCapacity) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
}
