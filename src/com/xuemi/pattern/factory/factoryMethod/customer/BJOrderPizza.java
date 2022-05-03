package com.xuemi.pattern.factory.factoryMethod.customer;

import com.xuemi.pattern.factory.factoryMethod.pizza.BJCheesePizza;
import com.xuemi.pattern.factory.factoryMethod.pizza.BJGreekPizza;
import com.xuemi.pattern.factory.factoryMethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            System.out.println("工厂子类创建对象");
            pizza = new BJCheesePizza();
        } else if (orderType.equals("greek")) {
            System.out.println("工厂子类创建对象");
            pizza = new BJGreekPizza();
        }

        return pizza;
    }
}
