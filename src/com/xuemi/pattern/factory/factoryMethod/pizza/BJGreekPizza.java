package com.xuemi.pattern.factory.factoryMethod.pizza;

public class BJGreekPizza extends Pizza{

    @Override
    public void prepare() {
        setName("Beijing Greek Pizza");
        System.out.println(name + " is preparing");
    }
}
