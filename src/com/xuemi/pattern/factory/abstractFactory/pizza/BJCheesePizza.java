package com.xuemi.pattern.factory.abstractFactory.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("Beijing Cheese Pizza");
        System.out.println(name + " is preparing");
    }
}
