package com.xuemi.pattern.factory.simpleFactory.improveStaticDemo.customer;

import com.xuemi.pattern.factory.simpleFactory.improveStaticDemo.pizza.CheesePizza;
import com.xuemi.pattern.factory.simpleFactory.improveStaticDemo.pizza.GreekPizza;
import com.xuemi.pattern.factory.simpleFactory.improveStaticDemo.pizza.MixPizza;
import com.xuemi.pattern.factory.simpleFactory.improveStaticDemo.pizza.Pizza;

public class SimpleStaticFactory {

    static Pizza pizza = null;

    public static Pizza createPizza(String orderType) {

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
