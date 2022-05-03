package com.xuemi.pattern.bridge;

/**
 * 桥接类：聚合PhoneBrand（即聚合了所有品牌）
 */
public abstract class PhoneBridge {

    //聚合不同品牌的手机
    PhoneBrand phoneBrand;

    //通过构造器来为手机品牌赋值
    public PhoneBridge(PhoneBrand phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    //对手机功能进行封装
    public void open() {
        this.phoneBrand.open();
    }

    public void close() {
        this.phoneBrand.close();
    }

    public void call() {
        this.phoneBrand.call();
    }
}
