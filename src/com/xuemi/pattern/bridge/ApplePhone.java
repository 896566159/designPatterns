package com.xuemi.pattern.bridge;

public class ApplePhone implements PhoneBrand{
    @Override
    public void open() {
        System.out.println("Apple开机");
    }

    @Override
    public void close() {
        System.out.println("Apple关机");
    }

    @Override
    public void call() {
        System.out.println("Apple通话");
    }
}
