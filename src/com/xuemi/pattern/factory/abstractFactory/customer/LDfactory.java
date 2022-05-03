package com.xuemi.pattern.factory.abstractFactory.customer;

import com.xuemi.pattern.factory.abstractFactory.pizza.LDCheesePizza;
import com.xuemi.pattern.factory.abstractFactory.pizza.LDGreekPizza;
import com.xuemi.pattern.factory.abstractFactory.pizza.Pizza;

public class LDfactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            System.out.println("London工厂");
            pizza = new LDCheesePizza();
            System.out.println("London工厂");
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
        }

        return pizza;
    }
}
