package com.xuemi.pattern.singleton;

/**
 * 饿汉式——静态代码块中完成单例对象的创建
 * 通过静态代码块实现单例模式
 */
public class EagerSingletonByStaticCodeBlock {

    //私有化静态方法
    private EagerSingletonByStaticCodeBlock() {

    }

    //声明一个今天的对象
    private static EagerSingletonByStaticCodeBlock singleton;

    //在静态代码块中创建对象
    static {
        singleton = new EagerSingletonByStaticCodeBlock();
    }

    //提供一个静态的、返回对象的方法
    public static EagerSingletonByStaticCodeBlock getInstance() {
        return singleton;
    }

}
