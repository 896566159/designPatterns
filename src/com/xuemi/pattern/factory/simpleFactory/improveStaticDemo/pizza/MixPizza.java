package com.xuemi.pattern.factory.simpleFactory.improveStaticDemo.pizza;

public class MixPizza extends Pizza {
    @Override
    public void prepare() {
        setName("mix pizza");
        System.out.println("mix pizza preparing;");
    }
}
