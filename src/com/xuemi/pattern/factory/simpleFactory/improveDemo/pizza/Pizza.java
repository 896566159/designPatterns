package com.xuemi.pattern.factory.simpleFactory.improveDemo.pizza;

public abstract class Pizza {

    //披萨的名字
    protected String name;

    // 准备工作
    public abstract void prepare();

    //披萨烘焙
    public void bake() {
        System.out.println(name + " baking;");
    }

    //披萨切分
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包披萨
    public void box() {
        System.out.println(name + " boxing;");
    }

    //披萨的名字设置
    public void setName(String name) {
        this.name = name;
    }
}
