package com.xuemi.pattern.factory.simpleFactory.violatedDemo.pizza;

public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        setName("Greek Pizza");
        System.out.println(name + " preparing;");
    }
}
