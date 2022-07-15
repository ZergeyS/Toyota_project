package main;

import main.Components.*;
import main.Models.Camry;
import main.Models.Dyna;
import main.Models.Hiance;
import main.Models.Solara;

public class VehiclesFactory {
    private FactoryCountries factoryCountry;
    private ComponentsFactory componentsFactory;

    public VehiclesFactory(FactoryCountries factoryCountry, ComponentsFactory componentsFactory)
            throws CountryFactoryNotEqualException {
        if (componentsFactory.getFactoryCountry() != factoryCountry) {
            throw new CountryFactoryNotEqualException("Страна производства деталей " +
                    componentsFactory.getFactoryCountry() + " не совпадает со страной конвеера " +
                    factoryCountry);
        }
        this.factoryCountry = factoryCountry;
        this.componentsFactory = componentsFactory;
    }

    public FactoryCountries getFactoryCountry() {
        return factoryCountry;
    }

    public Camry createCamry(String color, double price) {
        return new Camry(color, 200, Gearboxes.AUTOMATIC, false, price,
                componentsFactory.createEngine(), componentsFactory.createElectrics(),
                componentsFactory.createHeadlights(), componentsFactory.createFuelTank(),
                componentsFactory.createWheels(WheelSize.R16), false, new Usb());
    }

    public Solara createSolara(String color, double price) {
        return new Solara(color, 180, Gearboxes.ROBOTIC, false, price,
                componentsFactory.createEngine(), componentsFactory.createElectrics(),
                componentsFactory.createHeadlights(), componentsFactory.createFuelTank(),
                componentsFactory.createWheels(WheelSize.R17), false, new MiniFridge());
    }

    public Hiance createHiance(String color, double price) {
        return new Hiance(color, 160, Gearboxes.MANUAL, false, price,
                componentsFactory.createEngine(), componentsFactory.createElectrics(),
                componentsFactory.createHeadlights(), componentsFactory.createFuelTank(),
                componentsFactory.createWheels(WheelSize.R20), 1500, new Wheel(true, WheelSize.R20));
    }

    public Dyna createDyna(String color, double price) {
        return new Dyna(color, 150, Gearboxes.MANUAL, false, price,
                componentsFactory.createEngine(), componentsFactory.createElectrics(),
                componentsFactory.createHeadlights(), componentsFactory.createFuelTank(),
                componentsFactory.createWheels(WheelSize.R20), 2000, new Socet220v());
    }

}
