package com.xuemi.pattern.decorator;

/**
 * 豆浆类（调味料类的子类）——继承调味料类CondimentDecorator
 */
public class Soy extends CondimentDecorator{

    //通过构造器设置 调味料的描述、价格
    public Soy(CoffeeDrink coffeeDrink) {
        super(coffeeDrink);
        setDescription(", and add soy");
        setPrice(2.5f);
    }

}
