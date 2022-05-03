package com.xuemi.pattern.builder.improve;

public class HighHouse extends AbstractBuilder {

    public void info() {
        System.out.println("高楼需要招标");
    }

    @Override
    public void buildBasic() {
        info();
        System.out.println("高楼只需要打20米的地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼墙厚度55公分");
    }

    @Override
    public void roofed() {
        System.out.println("高楼用玻璃封顶");
    }
}
