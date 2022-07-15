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
        Solara solara = vehiclesFactory.createSolara("red",55555.55);
        Hiance hiance = vehiclesFactory.createHiance("white", 80000);
        Dyna dyna = vehiclesFactory.createDyna("blue", 100500);

        camry.isCruisecontrolIsOn();
        camry.cruisecontrolOn();
        camry.getUsb().musicOn();
//        camry.getFuelAmount();
        camry.start();
        camry.stop();

        solara.getMiniFridge().fridge();
        solara.headlightsOn();
        solara.start();
        solara.stop();

        hiance.getBackupWheel();
        hiance.start();

        dyna.getSocet220v().chargePhone();
        dyna.getMaxLoadCapacity();
        dyna.stop();

    }
}
