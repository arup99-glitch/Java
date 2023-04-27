package com.example.demo.Tast27;

public class Main {
    public static void main(String[] args) {
        ElectricalEquipment fan = new FAn();
        ElectricalEquipment light = new Light();

        Switch fancySwitch = new FancySwitch();
        Switch normalSwitch = new NormalSwitch();

        fancySwitch.setEquipment(fan);

        fancySwitch.on();
        fancySwitch.off();

        fancySwitch.setEquipment(light);

        fancySwitch.on();
        fancySwitch.off();

        normalSwitch.setEquipment(light);
        normalSwitch.on();
        normalSwitch.off();

    }
}
