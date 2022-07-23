package main;

import main.Models.Camry;
import main.Models.Dyna;
import main.Models.Hiance;
import main.Models.Solara;

public class VehicleStore {

    private int totalVehicleAmount = 0;
    private int totalFreeSpace = 1000;

    private int amountCamry = 0;
    private int amountSolara = 0;
    private int amountHiance = 0;
    private int amountDyna = 0;
    private Vehicle[] storage = new Vehicle[this.totalFreeSpace];

    public int getTotalVehicleAmount() {
        return totalVehicleAmount;
    }
    public int getTotalFreeSpace() {
        return totalFreeSpace;
    }
    public int getAmountCamry() {
        return amountCamry;
    }
    public int getAmountSolara() {
        return amountSolara;
    }
    public int getAmountHiance() {
        return amountHiance;
    }
    public int getAmountDyna() {
        return amountDyna;
    }
//--------------------------------------------------------------------------------
    public void addVehicle(Vehicle vehicle) {
//        if (vehicle != null) {
            if (totalFreeSpace != 0) {
                for (int i = 0; i < storage.length; i++) {
                    if (storage[i] == null) {
                        storage[i] = vehicle;
                        totalVehicleAmount += 1;
                        totalFreeSpace -= 1;
                        if (vehicle instanceof Camry) {
                            amountCamry += 1;
                        } else if (vehicle instanceof Solara) {
                            amountSolara += 1;
                        } else if (vehicle instanceof Hiance) {
                            amountHiance += 1;
                        } else if (vehicle instanceof Dyna) {
                            amountDyna += 1;
                        }
                        break;
                    }
                }
            } else {
                System.out.println("На складе закончилось свободное место");
            }
        }
//    }
//--------------------------------------------------------------
    public void removeVehicle(Vehicle vehicle) {
//        for (Vehicle vehicle1 : storage) {
//            if (vehicle1 == vehicle) {
//                vehicle1 = null;
//                System.out.println("Со склада забрали " + vehicle1);
//            }
//        }

        for (int j = 0; j < storage.length; j++) {
            if (storage[j] == vehicle) {
                System.out.println("Со склада забрали " + storage[j].toString());
                if (storage[j] instanceof Camry) {
                    amountCamry -= 1;
                } else if (storage[j] instanceof Solara) {
                    amountSolara -= 1;
                } else if (storage[j] instanceof Hiance) {
                    amountHiance -= 1;
                } else if (storage[j] instanceof Dyna) {
                    amountDyna -= 1;
                }
                totalVehicleAmount -= 1;
                totalFreeSpace += 1;
                storage[j] = null;
                break;
            }
        }
    }
//--------------------------------------------------------------
    public void printArray() {
        for (Vehicle vehicle : storage) {
            System.out.println(vehicle);
        }
    }
}
