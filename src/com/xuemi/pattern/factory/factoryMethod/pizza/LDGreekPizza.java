package com.xuemi.pattern.factory.factoryMethod.pizza;

public class LDGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("London Greek Pizza");
        System.out.println(name + " is preparing");
    }
}
