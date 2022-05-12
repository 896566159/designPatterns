package com.xuemi.pattern.observer.improveDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气类
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;
    //订阅者集合
    List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public  void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 所有的订阅者
        notifyObserver(temperature, pressure, humidity);
    }

    @Override
    public void notifyObserver(float temperature, float pressure, float humidity) {
        for (Observer observer: observers) {
            observer.update(temperature, pressure, humidity);
        }
    }
}
