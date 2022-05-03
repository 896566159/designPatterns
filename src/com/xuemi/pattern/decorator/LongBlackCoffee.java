package com.xuemi.pattern.decorator;

/**
 * 单品咖啡——美式咖啡
 */
public class LongBlackCoffee extends Coffee{

    //通过构造器 来初始化单品咖啡的价格和单品描述
    public LongBlackCoffee() {
        setPrice(10.0f);
        setDescription("It's long black Coffee");
    }

}
