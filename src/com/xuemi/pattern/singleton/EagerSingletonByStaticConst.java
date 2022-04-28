package com.xuemi.pattern.singleton;

/**
 * 饿汉式——静态常量
 * 线程安全，但是由于在加载类的时候就进行了对象的实例化，可能造成实例化对象没有被使用过而出现内存浪费
 */
public class EagerSingletonByStaticConst {

    //私有化构造方法
    private EagerSingletonByStaticConst() {
    }

    //将静态成员变量单例对象私有化
    private static final EagerSingletonByStaticConst singleton = new EagerSingletonByStaticConst();

    //向外提供一个 静态的 调用单例对象的方法
    public static EagerSingletonByStaticConst getInstance() {
        return singleton;
    }
}
