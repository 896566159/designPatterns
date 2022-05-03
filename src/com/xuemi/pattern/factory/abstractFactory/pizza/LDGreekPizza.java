package com.xuemi.pattern.factory.abstractFactory.pizza;

public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("London Greek Pizza");
        System.out.println(name + " is preparing");
    }
}
