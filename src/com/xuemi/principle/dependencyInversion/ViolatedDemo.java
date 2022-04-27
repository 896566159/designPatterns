package com.xuemi.principle.dependencyInversion;

public class ViolatedDemo {

    public static void main(String[] args) {
        new Person().receive(new Email());
    }

}

//违背原因分析：假如信息对象是微信、短信等，则需要新建类，且Person类中需要新建方法
class Email{
    public String getInfo() {
        return "电子邮件信息get";
    }
}

class Person{
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

