package com.xuemi.pattern.visitor;

public class Client {

    public static void main(String[] args) {

        //创建一个 集合对象
        DataStructure dataStructure = new DataStructure();

        //创建两个投票人
        Man man = new Man();
        Woman woman = new Woman();

        //投票人加入集合
        dataStructure.attach(man);
        dataStructure.attach(woman);
        dataStructure.attach(new Man());

        //创建一个通过的选票
        Pass pass = new Pass();

        //显示投票结果
        dataStructure.display(pass);

    }

}
