package main;

import main.Components.FuelTank;

import main.Models.Camry;
import main.Models.Dyna;
import main.Models.Hiance;
import main.Models.Solara;

public class Runner {
    public static void main(String[] args) throws CountryFactoryNotEqualException, StartCarException {
        VehiclesFactory vehiclesFactory = new VehiclesFactory(FactoryCountries.USA, new ComponentsFactory(FactoryCountries.USA));
//        VehiclesFactory vehiclesFactory = new VehiclesFactory(FactoryCountries.USSR, new ComponentsFactory(FactoryCountries.UK));

        Camry camry = vehiclesFactory.createCamry("black", 50000.00);
        Camry camry2 = vehiclesFactory.createCamry("black", 50000.00);
        Solara solara = vehiclesFactory.createSolara("red",55555.55);
        Hiance hiance = vehiclesFactory.createHiance("white", 80000);
        Dyna dyna = vehiclesFactory.createDyna("blue", 100500);

//        camry.isCruisecontrolIsOn();
//        camry.cruisecontrolOn();
//        camry.getUsb().musicOn();
//        camry.setFuelAmount(10);
//        camry.start();
//        camry.stop();
//
//        solara.getMiniFridge().fridge();
//        solara.headlightsOn();
//        solara.setFuelAmount(10);
//        solara.start();
//        solara.stop();
//
//        hiance.getBackupWheel();
//        hiance.setFuelAmount(12);
//        hiance.start();
//
//        dyna.getSocet220v().chargePhone();
//        dyna.getMaxLoadCapacity();
//        dyna.stop();

        VehicleStore vehicleStore = new VehicleStore();
        vehicleStore.addVehicle(camry);
        vehicleStore.addVehicle(solara);
        vehicleStore.addVehicle(hiance);
        vehicleStore.addVehicle(dyna);
        vehicleStore.addVehicle(camry2);

        System.out.println("Камрей " + vehicleStore.getAmountCamry() + " шт.");
        System.out.println("Солар " + vehicleStore.getAmountSolara() + " шт.");
        System.out.println("Хайнсов " + vehicleStore.getAmountHiance() + " шт.");
        System.out.println("Дынь " + vehicleStore.getAmountDyna() + " шт.");
        System.out.println("Всего машин на складе " + vehicleStore.getTotalVehicleAmount() + " шт.");
        System.out.println("Свободных место на складе " + vehicleStore.getTotalFreeSpace() + ".");

        vehicleStore.removeVehicle(dyna);
        vehicleStore.removeVehicle(camry);
        vehicleStore.removeVehicle(camry2);
//    vehicleStore.printArray();

        System.out.println("Камрей " + vehicleStore.getAmountCamry() + " шт.");
        System.out.println("Солар " + vehicleStore.getAmountSolara() + " шт.");
        System.out.println("Хайнсов " + vehicleStore.getAmountHiance() + " шт.");
        System.out.println("Дынь " + vehicleStore.getAmountDyna() + " шт.");
        System.out.println("Всего машин на складе " + vehicleStore.getTotalVehicleAmount() + " шт.");
        System.out.println("Свободных место на складе " + vehicleStore.getTotalFreeSpace() + ".");

//        vehicleStore.printArray();
    }
}
