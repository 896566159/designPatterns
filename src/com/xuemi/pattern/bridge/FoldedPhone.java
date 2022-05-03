package com.xuemi.pattern.bridge;

/**
 * 折叠式手机：通过继承的方式，来桥接上PhoneBridge抽象类
 */
public class FoldedPhone extends PhoneBridge{

    public FoldedPhone(PhoneBrand phoneBrand) {
        super(phoneBrand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("该手机是折叠手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("该手机是折叠手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("该手机是折叠手机");
    }
}
