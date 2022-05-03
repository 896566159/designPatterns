package com.xuemi.pattern.factory.abstractFactory.customer;

import com.xuemi.pattern.factory.abstractFactory.pizza.Pizza;

public interface AbstractFactory {

    public abstract Pizza createPizza(String orderType);

}
