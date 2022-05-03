package com.xuemi.pattern.factory.abstractFactory.customer;

import com.xuemi.pattern.factory.abstractFactory.pizza.BJCheesePizza;
import com.xuemi.pattern.factory.abstractFactory.pizza.BJGreekPizza;
import com.xuemi.pattern.factory.abstractFactory.pizza.Pizza;

public class BJfactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            System.out.println("北京工厂");
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            System.out.println("北京工厂");
            pizza = new BJGreekPizza();
        }

        return pizza;
    }
}
