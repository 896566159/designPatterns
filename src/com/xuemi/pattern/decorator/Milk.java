package com.xuemi.pattern.decorator;

/**
 * 牛奶类（调味料类的子类）——继承调味料类CondimentDecorator
 */
public class Milk extends CondimentDecorator{

    //通过构造器设置 调味料的描述、价格
    public Milk(CoffeeDrink coffeeDrink) {
        super(coffeeDrink);
        setDescription(", and add milk");
        setPrice(1.5f);
    }

}
