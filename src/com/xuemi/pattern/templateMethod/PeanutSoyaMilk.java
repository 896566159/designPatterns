package com.xuemi.pattern.templateMethod;

public class PeanutSoyaMilk extends AbsSoyaMilk{

    @Override
    void addCondiment() {
        System.out.println("花生味豆浆需要加入花生");
    }
}
