package com.xuemi.pattern.factory.abstractFactory.customer;

import com.xuemi.pattern.factory.abstractFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    Pizza pizza = null;
    String orderType = "";
    AbstractFactory factory;

    public OrderPizza(AbstractFactory factory) {
        setFactory(factory);
    }

    public void setFactory(AbstractFactory factory) {

        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
            }

        } while (true);
    }

    private String getType() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            System.out.println("请输入欲订购的Pizza名：");
            str = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
