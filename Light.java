package com.example.demo.Tast27;

public class Light implements ElectricalEquipment{
    @Override
    public void PowerOn() {
        System.out.println("Light is on");
    }

    @Override
    public void PowerOff() {
        System.out.println("Light is off");
    }
}
