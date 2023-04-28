package org.example.Task2;

 class LatteCoffeeBuilder extends CoffeeBuilder {
     @Override
     public void builDespressoProportion() {
         coffee.setEspressoProportion(" 1/3 espresso");
     }

     @Override
     public void buildSteamedmilkProportion() {
         coffee.setSteamedmilkProportion(" 2/3 steamed milk");
     }

     @Override
     public void buildFoamProportion() {
         coffee.setFoamProportion("a thin layer of foam on top.");

     }
 }
