package org.example;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder _pizzaBuilder) {
        pizzaBuilder = _pizzaBuilder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza(){

        pizzaBuilder.createNewPizzaProduct();

        pizzaBuilder.buildDough();

        pizzaBuilder.buildSauce();

        pizzaBuilder.buildTopping();

    }
}
