package com.xuemi.pattern.singleton;

/**
 * 懒汉式——单线程安全
 * 不推荐使用这种实现方式，单线程下安全
 * 多线程不安全的
 * 不会造成空间浪费
 */
public class LazySingletonNotSecurity {

    //私有化构造方法
    private LazySingletonNotSecurity() {}

    //声明单例对象
    private static LazySingletonNotSecurity singleton;

    //向外提供单例对象调用方法
    public static LazySingletonNotSecurity getInstance() {

        //如果单例对象为空，则创建单例对象
        if (singleton == null) {
            singleton = new LazySingletonNotSecurity();
        }

        return singleton;
    }
}
