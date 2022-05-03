package com.xuemi.pattern.factory.factoryMethod.customer;

import com.xuemi.pattern.factory.factoryMethod.pizza.BJCheesePizza;

public class PizzaStore {

    public static void main(String[] args) {

        //订购北京Pizza
//        new BJOrderPizza();

        //订购London Pizza
        new LDOrderPizza();
    }

}
