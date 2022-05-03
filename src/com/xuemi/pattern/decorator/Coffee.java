package com.xuemi.pattern.decorator;

/**
 * 被装饰者——继承基类CoffeeDrink，并且被单品咖啡子类继承
 * 由于咖啡的单品种类较多，所以该类作为所有 单品咖啡 的次基类
 */
public class Coffee extends CoffeeDrink{

    //需要实现基类CoffeeDrink的价格计算方法
    @Override
    public float cost() {
        //直接返回价格——因为 单品咖啡不加调味料，价格就是单品咖啡的价格
        return getPrice();
    }

}
