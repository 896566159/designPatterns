package com.xuemi.pattern.builder.violatedDemo;

public abstract class AbstractHouse {

    //房子构建的三个步骤：打地基、建墙、封顶
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
