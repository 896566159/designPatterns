package com.xuemi.pattern.factory.factoryMethod.pizza;

public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("London Cheese Pizza");
        System.out.println(name + " is preparing");
    }
}
