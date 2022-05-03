package com.xuemi.pattern.factory.simpleFactory.violatedDemo.customer;

import com.xuemi.pattern.factory.simpleFactory.violatedDemo.pizza.CheesePizza;
import com.xuemi.pattern.factory.simpleFactory.violatedDemo.pizza.GreekPizza;
import com.xuemi.pattern.factory.simpleFactory.violatedDemo.pizza.MixPizza;
import com.xuemi.pattern.factory.simpleFactory.violatedDemo.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购披萨的类型

        do {
            orderType = getType();
            if (orderType.equals("greek")) {
				pizza = new GreekPizza();
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
			} else if (orderType.equals("mix")) {
				pizza = new MixPizza();
			} else {
				break;
			}

			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

		} while (true);
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
