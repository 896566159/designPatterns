package com.xuemi.pattern.observer.improveDemo;

/**
 * 观察者——订阅者
 */
public interface Observer {

    //更新方法
    abstract void update(float temperature, float pressure, float humidity);

}
