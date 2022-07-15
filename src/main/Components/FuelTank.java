package main.Components;

public class FuelTank {
    public int fuelAmount;

    public FuelTank(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}
