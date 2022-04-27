package com.xuemi.principle.dependencyInversion;

public class DependencyPass {

    public static void main(String[] args) {
        new OpenAndClose().open(new XM());//通过接口

        new OpenAndClose1(new XM1()).open();//通过构造器

        //通过setter
        OpenAndClose2 openAndClose2 = new OpenAndClose2();
        openAndClose2.setTv(new XM1());
        openAndClose2.open();
    }

}

//方式一：通过接口传递实现依赖
interface IOpenAndClose {
    public void open(ITV tv);//抽象方法接受抽象接口
}

interface ITV {
    public void play();
}

class XM implements ITV {

    @Override
    public void play() {
        System.out.println("小米电视打开");
    }
}

class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

//方式二：通过构造器方法依赖传递
interface IOpenAndClose1 {
    public void open();//抽象方法接受抽象接口
}

interface ITV1 {
    public void play();
}

class XM1 implements ITV1 {

    @Override
    public void play() {
        System.out.println("小米电视打开");
    }
}

class OpenAndClose1 implements IOpenAndClose1 {
    ITV1 tv;

    public OpenAndClose1(ITV1 tv) {//构造器
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}

//方式三：通过setter方法依赖传递
class OpenAndClose2 implements IOpenAndClose1 {
    ITV1 tv;

    public void setTv(ITV1 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}