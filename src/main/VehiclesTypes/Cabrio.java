package main.VehiclesTypes;

import main.Components.*;
import main.Vehicle;

public abstract class Cabrio extends Vehicle {
    private boolean roofIsOpen;

    public Cabrio(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                  Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
                  Wheel[] wheels, boolean roofIsOpen) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels);
        this.roofIsOpen = roofIsOpen;
    }

    public void openRoof() {
        if (roofIsOpen) {
            System.out.println("Крыша уже открыта");
        } else {
            roofIsOpen = !roofIsOpen;
            System.out.println("Крыша открыыается");
        }
    }

    public void closeRoof() {
        if (!roofIsOpen) {
            System.out.println("Крыша уже закрыта");
        } else {
            roofIsOpen = !roofIsOpen;
            System.out.println("Крыша закрыыается");
        }
    }

    public void getRoofState() {
        if (roofIsOpen) {
            System.out.println("Крыша открыта");
        } else {
            System.out.println("Крыша закрыта");
        }
    }
}
