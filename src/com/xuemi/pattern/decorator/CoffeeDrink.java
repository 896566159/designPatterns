package com.xuemi.pattern.decorator;

/**
 * 基类
 * 装饰者和被装饰者 都会继承该 基类
 */
public abstract class CoffeeDrink {

    //咖啡饮料 这个类中的成员变量：
    String description;//咖啡描述
    float price = 0.0f;//咖啡价格

    //成员变量的get、set方法
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算咖啡的价格的抽象方法， 具体的计算由子类实现
    public abstract float cost();
}
