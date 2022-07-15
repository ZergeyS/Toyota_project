package main;

import main.Components.*;

public class ComponentsFactory {
    private FactoryCountries factoryCountry;

    public ComponentsFactory(FactoryCountries factoryCountry) {
        this.factoryCountry = factoryCountry;
    }

    public Engine createEngine() {
        return new Engine(true);
    }

    public FuelTank createFuelTank() {
        return new FuelTank(0);
    }

    public Electrics createElectrics() {
        return new Electrics(true);
    }

    public Headlights createHeadlights() {
        return new Headlights(true);
    }

    public Wheel[] createWheels(WheelSize wheelSize) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(true, wheelSize);
        }
        return wheels;
    }

    public FactoryCountries getFactoryCountry() {
        return factoryCountry;
    }
}
