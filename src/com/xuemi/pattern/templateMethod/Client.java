package com.xuemi.pattern.templateMethod;

public class Client {

    public static void main(String[] args) {

        //花生味豆浆的制作
        AbsSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        //直接调用 制造流程的模板方法
        peanutSoyaMilk.soyaMakingTemplateMethod();

        System.out.println("----------------------------");

        //红豆味豆浆的制作
        AbsSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        //直接调用 制造流程的模板方法
        redBeanSoyaMilk.soyaMakingTemplateMethod();
    }

}
