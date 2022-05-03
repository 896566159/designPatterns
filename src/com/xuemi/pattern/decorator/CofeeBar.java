package com.xuemi.pattern.decorator;

public class CofeeBar {

    public static void main(String[] args) {

        //订单一
        //先点单品
        CoffeeDrink order1 = new LongBlackCoffee();
        //单品加调味料
        order1 = new Chocolate(order1);
        System.out.println("order1‘s cost:" + order1.cost());
        System.out.println(order1.getDescription());

        System.out.println("---------------------------");

        //订单二
        //只点单品
        CoffeeDrink order2 = new EspressoCoffe();
        System.out.println("order2‘s cost : " + order2.cost());
        System.out.println(order2.getDescription());

        System.out.println("---------------------------");

        //订单三
        //先点单品
        CoffeeDrink order3 = new LongBlackCoffee();
        //单品加调味料1
        order3 = new Chocolate(order3);
        //单品加调味料2
        order3 = new Soy(order3);
        System.out.println("order3‘s cost:" + order3.cost());
        System.out.println(order3.getDescription());
    }

}
