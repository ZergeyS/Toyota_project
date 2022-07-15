package main;

import main.Components.*;

public abstract class Vehicle {
    private String color;
    private int maxSpeed;
    private Gearboxes gearbox;
    private boolean isMoved;
    private double price;

    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;
    private FuelTank fuelTank;
    private Wheel[] wheels;

    public Vehicle(String color, int maxSpeed, Gearboxes gearbox, boolean isMoved, double price,
                   Engine engine, Electrics electrics, Headlights headlights, FuelTank fuelTank, Wheel[] wheels) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearbox = gearbox;
        this.isMoved = isMoved;
        this.price = price;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.fuelTank = fuelTank;
        this.wheels = wheels;
    }
    public void start() throws StartCarException {
        if (!checkWheels())
            throw new StartCarException("проблема с колесами");
        if (fuelTank.getFuelAmount() <= 0)
            throw new StartCarException("бензобак пуст");
        if (!headlights.isWorked())
            throw new StartCarException("фары не фарят");
        if (!electrics.isWorked())
            throw new StartCarException("электрика не элетрит");
        if (!engine.isWorked())
            throw new StartCarException("двигатель не двигает");
        isMoved = true;
        System.out.println("Поехали !");
    }
    public void stop() {
        if (!isMoved) {
            System.out.println("машина уже стоит");
        } else {
            isMoved = false;
            System.out.println("Остановились");
        }
    }
    public void setFuelAmount(int amount) {
        fuelTank.setFuelAmount(amount);
    }

    public void headlightsOn() {
        System.out.println("фары вкл.");
    }
    public boolean checkWheels() {
        for (Wheel wheel : wheels) {
            if (!wheel.isWorked())
                return false;
            if (wheels.length < 4)
                return false;
        }
        return true;
    }
}
