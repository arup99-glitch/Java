package org.example.Task2;

abstract class CoffeeBuilder {
    protected Coffee coffee;

    public Coffee getCoffee() {
        return coffee;
    }
    public void createNewCoffeeProduct(){
        coffee=new Coffee();
    }

    public abstract void builDespressoProportion();
    public abstract void buildSteamedmilkProportion();
    public abstract void buildFoamProportion();
}
