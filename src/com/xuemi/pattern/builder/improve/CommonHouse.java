package com.xuemi.pattern.builder.improve;

public class CommonHouse extends AbstractBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子只需要打2米的地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子墙厚度15公分");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子用混凝土封顶");
    }
}
