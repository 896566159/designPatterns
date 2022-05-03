package com.xuemi.pattern.bridge;

/**
 * 手机品牌接口
 */
public interface PhoneBrand {

    //定义各种手机都会有的功能，具体实现在具体的实现类中
    void open();

    void close();

    void call();

}
