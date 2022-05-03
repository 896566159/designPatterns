package com.xuemi.pattern.prototype.violatedDemo;

public class Client {

    public static void main(String[] args) {
        Sheep tom = new Sheep("tom", 10, 1);

        //拷贝一只和Tom属性值一样的Sheep对象
        Sheep tom1 = new Sheep(tom.getName(), tom.getAge(), tom.getMale());

        System.out.println(tom == tom1);
        System.out.println("tom" + tom.hashCode());
        System.out.println("tom1" + tom1.hashCode());
    }
}
