package com.xuemi.pattern.decorator;

/**
 * 单品咖啡——意大利咖啡
 */
public class EspressoCoffe extends Coffee{

    //通过构造器 来初始化单品咖啡的价格和单品描述
    public EspressoCoffe() {
        setPrice(20.0f);
        setDescription("It's espresso Coffee");
    }

}
