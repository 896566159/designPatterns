package com.xuemi.pattern.templateMethod;

public class RedBeanSoyaMilk extends AbsSoyaMilk{

    @Override
    void addCondiment() {
        System.out.println("红豆味豆浆需要加入红豆");
    }

}
