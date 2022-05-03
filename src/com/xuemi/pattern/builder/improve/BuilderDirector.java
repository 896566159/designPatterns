package com.xuemi.pattern.builder.improve;

public class BuilderDirector {

    //声明一个抽象构造者对象
    AbstractBuilder builder;

    //通过构造器来为抽象构造者赋值
    public BuilderDirector(AbstractBuilder abstractBuilder) {
        this.builder = abstractBuilder;
    }

    //通过set方法来为抽象构造者赋值
    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public House buildHouse() {
        //在此方法中声明了House的构造流程
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();

        //返回构造后的房子
        return builder.buildHouse();
    }
}
