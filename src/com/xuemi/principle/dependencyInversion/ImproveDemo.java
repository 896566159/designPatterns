package com.xuemi.principle.dependencyInversion;

public class ImproveDemo {

    public static void main(String[] args) {
        new Person1().receive(new Email1());
        new Person1().receive(new Wechat());
    }

}

interface IReceive {
    public String getInfo();
}

class Email1 implements IReceive{

    @Override
    public String getInfo() {
        return "电子邮件信息get";
    }
}

class Wechat implements IReceive{

    @Override
    public String getInfo() {
        return "微信信息get";
    }
}

class Person1 {
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());
    }
}
