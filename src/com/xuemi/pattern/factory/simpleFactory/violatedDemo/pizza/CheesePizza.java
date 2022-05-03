package com.xuemi.pattern.factory.simpleFactory.violatedDemo.pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("Cheese Pizza");
        System.out.println(name + " preparing;");
    }
}
