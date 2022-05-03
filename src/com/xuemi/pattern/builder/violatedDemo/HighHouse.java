package com.xuemi.pattern.builder.violatedDemo;

public class HighHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
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
