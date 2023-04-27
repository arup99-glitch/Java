package com.example.demo.Tast27;

public class Switch {

    private ElectricalEquipment equipment;

    public void setEquipment(ElectricalEquipment equipment) {
        this.equipment = equipment;
    }

    public ElectricalEquipment getEquipment() {
        return equipment;
    }

    public void on(){
        System.out.println("Switch on the equipment");
        equipment.PowerOn();
     }
     public void off(){
         System.out.println("Switch off the equipment");
         equipment.PowerOff();
     }
}
