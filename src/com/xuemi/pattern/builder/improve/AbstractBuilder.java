package com.xuemi.pattern.builder.improve;

public abstract class AbstractBuilder {

    //将产品封装成成员变量
    House house = new House();

    //建造产品所需要的过程
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
