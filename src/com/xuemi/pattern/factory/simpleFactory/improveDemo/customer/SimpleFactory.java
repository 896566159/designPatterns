package com.xuemi.pattern.factory.simpleFactory.improveDemo.customer;

import com.xuemi.pattern.factory.simpleFactory.improveDemo.pizza.CheesePizza;
import com.xuemi.pattern.factory.simpleFactory.improveDemo.pizza.GreekPizza;
import com.xuemi.pattern.factory.simpleFactory.improveDemo.pizza.MixPizza;
import com.xuemi.pattern.factory.simpleFactory.improveDemo.pizza.Pizza;

public class SimpleFactory {

    Pizza pizza = null;

    public Pizza createPizza(String orderType) {

        do {

            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            } else if (orderType.equals("mix")) {
                pizza = new MixPizza();
            } else {
                break;
            }

            return pizza;

        } while (true);

        return pizza;
    }

}
