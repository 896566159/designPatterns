package com.xuemi.pattern.factory.factoryMethod.customer;

import com.xuemi.pattern.factory.factoryMethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public abstract Pizza createPizza(String orderType);

    Pizza pizza = null;
    String orderType = "";

    public OrderPizza() {

        do {
            System.out.println("工厂抽象创建对象的方法");
            orderType = getType();
            pizza = createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
            }

        } while(true);
    }

    protected String getType() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入欲订购的Pizza名字");
            String str = bf.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
