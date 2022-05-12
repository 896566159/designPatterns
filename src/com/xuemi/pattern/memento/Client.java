package com.xuemi.pattern.memento;

public class Client {

    public static void main(String[] args) {

        //创建一个Caretaker对象
        Caretaker caretaker = new Caretaker();

        //创建一个Originator对象
        Originator originator = new Originator();

        //设置状态值
        originator.setState("攻击力100，防御力100");

        //将当前状态保存到备忘录
        caretaker.add(originator.saveState());

        //重置状态值
        originator.setState("攻击力200，防御力200");

        //将当前状态保存到备忘录
        caretaker.add(originator.saveState());

        //获取第 1 个状态值
        Memento memento = caretaker.get(0);
        System.out.println(memento.getState());
    }

}
