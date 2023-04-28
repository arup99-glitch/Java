package org.example.Task2;

class Waiter {
    private CoffeeBuilder coffeeBuilder;

    public void setCoffeeBuilder(CoffeeBuilder cb){
        coffeeBuilder =cb;
    }
    public Coffee getCoffee(){
        return coffeeBuilder.getCoffee();
    }
    public void buildCoffee(){
        coffeeBuilder.createNewCoffeeProduct();
        coffeeBuilder.builDespressoProportion();
        coffeeBuilder.buildSteamedmilkProportion();
        coffeeBuilder.buildFoamProportion();
    }
}
