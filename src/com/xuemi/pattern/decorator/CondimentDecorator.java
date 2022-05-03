package com.xuemi.pattern.decorator;

/**
 * 装饰者——继承基类CoffeeDrink，并且在类中 聚合（使用） 基类CoffeeDrink的对象
 * 调味料类：咖啡饮品，往往会在单品的基础上加入 牛奶、巧克力等 调味料
 */
public class CondimentDecorator extends CoffeeDrink{

    //聚合（使用）基类CoffeeDrink的对象，将该对象装饰起来
    CoffeeDrink coffee;

    //通过构造器来初始化该 咖啡饮品 的单品类对象
    public CondimentDecorator(CoffeeDrink coffeeDrink) {//聚合
        this.coffee = coffeeDrink;
    }

    //实现价格的计算： 价格 = 单品（coffee）价格 + 调味料自身的价格
    @Override
    public float cost() {
        // 价格 = 单品（coffee）价格 + 调味料自身的价格
        return coffee.cost() + super.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "(" + coffee.cost() + ")"
                + super.getDescription() + "(" + super.getPrice() + ")";
    }
}
