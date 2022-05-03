package com.xuemi.pattern.factory.simpleFactory.improveDemo.customer;

import com.xuemi.pattern.factory.simpleFactory.improveDemo.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //声明专门创建pizza对象的工厂类
    SimpleFactory simpleFactory = new SimpleFactory();
    String orderType = "";
    Pizza pizza = null;

    public OrderPizza() {
        //调用工厂类创建pizza类对象
        orderType = getType();
        pizza = simpleFactory.createPizza(orderType);

        // 如果创建的pizza对象成功，可调用其生产过程
        if (pizza != null) {
            System.out.println("工厂类生产的pizza");
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("不存在这种pizza");
        }

    }


    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
