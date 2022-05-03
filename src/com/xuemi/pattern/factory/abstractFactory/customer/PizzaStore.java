package com.xuemi.pattern.factory.abstractFactory.customer;

public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza(new BJfactory()).orderPizza();
        new OrderPizza(new BJfactory());
    }

}
