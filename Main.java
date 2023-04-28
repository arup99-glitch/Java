package org.example.Task2;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        CoffeeBuilder cappuccinoCoffeeBuilder = new CappuccinoCoffeeBuilder();
        CoffeeBuilder latteCoffeeBuilder = new LatteCoffeeBuilder();

        System.out.print("Cappuccino Coffee: ");
        waiter.setCoffeeBuilder(cappuccinoCoffeeBuilder);
        waiter.buildCoffee();
        Coffee coffee = waiter.getCoffee();
        System.out.println(coffee.toString());

        System.out.print("Latte Coffee: ");
        waiter.setCoffeeBuilder(latteCoffeeBuilder);
        waiter.buildCoffee();
        Coffee coffee2 = waiter.getCoffee();
        System.out.println(coffee2.toString());

    }
}
