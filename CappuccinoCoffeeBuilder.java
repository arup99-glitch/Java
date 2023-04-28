package org.example.Task2;

public class CappuccinoCoffeeBuilder extends CoffeeBuilder{
    @Override
    public void builDespressoProportion() {
        coffee.setEspressoProportion("1/3 espresso");
    }

    @Override
    public void buildSteamedmilkProportion() {
        coffee.setSteamedmilkProportion(" 1/3 steamed milk");
    }

    @Override
    public void buildFoamProportion() {
        coffee.setFoamProportion(" 1/3 foam");
    }
}
