package main.Models;

import main.Components.*;
import main.VehiclesTypes.Truck;

import java.util.Arrays;

public class Dyna extends Truck {
    private Socet220v socet220v;

    public Dyna(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
                Wheel[] wheels, int maxLoadCapacity, Socet220v socet220v) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels, maxLoadCapacity);
        this.socet220v = socet220v;
    }

    public Socet220v getSocet220v() {
        return socet220v;
    }

    @Override
    public String toString() {
        return "Dyna{" +
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
