package main.Models;

import main.Components.*;
import main.VehiclesTypes.Cabrio;

import java.util.Arrays;

public class Solara extends Cabrio {
    private MiniFridge miniFridge;

    public Solara(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                  Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank,
                  Wheel[] wheels, boolean roofIsOpen, MiniFridge miniFridge) {
        super(color, maxSpeed, gearbox, isMoved, price, engine, electrics, headlights, fuelTank, wheels, roofIsOpen);
        this.miniFridge = miniFridge;
    }

    public MiniFridge getMiniFridge() {
        return miniFridge;
    }

    @Override
    public String toString() {
        return "Solara{" +
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
