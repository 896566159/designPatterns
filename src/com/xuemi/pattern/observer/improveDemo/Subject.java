package com.xuemi.pattern.observer.improveDemo;

/**
 * 订阅接口
 */
public interface Subject {

    //添加订阅者
    abstract void addObserver(Observer observer);

    //删除订阅者
    abstract void removeObserver(Observer observer);

    //向订阅者推送消息
    public void notifyObserver(float temperature, float pressure, float humidity);

}
