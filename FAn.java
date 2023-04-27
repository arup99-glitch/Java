package com.example.demo.Tast27;

public class FAn implements ElectricalEquipment {
    @Override
    public void PowerOn() {
        System.out.println("Fan is on");
    }

    @Override
    public void PowerOff() {
        System.out.println("Fan is off");
    }
}
