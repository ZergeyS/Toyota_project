package main.Models;

import main.Components.*;
import main.VehiclesTypes.Truck;

public class Hiance extends Truck {
    private Wheel backupWheel;

    public Hiance(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                  Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
                  Wheel[] wheels, int maxLoadCapacity, Wheel backupWheel) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels, maxLoadCapacity);
        this.backupWheel = backupWheel;
    }

    public Wheel getBackupWheel() {
        System.out.println("запаска на месте");
        return backupWheel;
    }
}
