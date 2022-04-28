package com.xuemi.pattern.singleton;

/**
 * 懒汉式——静态内部类
 * 利用Java类装载的机制来保证懒加载
 * 静态内部类Singleton只有在被调用了getInstance方法时，才会进行singleton对象的实例化
 * 类的静态属性只会在第一次加载类的时候初始化
 * 线程安全、延迟加载，效率高
 * 推荐使用
 */
public class LazySingletonSecurityByInnerClass {

    //私有化单例对象
    private static volatile Singleton singleton;

    //私有化构造方法
    private LazySingletonSecurityByInnerClass() {}

    //静态内部类里面闯将一个常量
    private static class Singleton{
        private static final LazySingletonSecurityByInnerClass SINGLETON = new LazySingletonSecurityByInnerClass();
    }

    //提供一个公共调用方法
    public static synchronized LazySingletonSecurityByInnerClass getInstance() {
        return Singleton.SINGLETON;
    }

}
