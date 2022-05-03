package com.xuemi.pattern.factory.factoryMethod.customer;

import com.xuemi.pattern.factory.factoryMethod.pizza.*;

import static java.lang.Thread.sleep;

public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            System.out.println("工厂子类创建对象");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pizza = new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            System.out.println("工厂子类创建对象");
            pizza = new LDGreekPizza();
        }

        return pizza;
    }
}
