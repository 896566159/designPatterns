package com.xuemi.pattern.bridge;

public class HuaWeiPhone implements PhoneBrand{
    @Override
    public void open() {
        System.out.println("华为开机");
    }

    @Override
    public void close() {
        System.out.println("华为关机");
    }

    @Override
    public void call() {
        System.out.println("华为通话");
    }
}
