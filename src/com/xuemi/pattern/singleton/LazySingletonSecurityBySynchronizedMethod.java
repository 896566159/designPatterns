package com.xuemi.pattern.singleton;

/**
 * 懒汉式——同步代码块保证线程安全
 * 线程安全的，但是同步方法效率低,实际开发中不推荐使用
 */
public class LazySingletonSecurityBySynchronizedMethod {

    //私有化单例对象
    private static LazySingletonSecurityBySynchronizedMethod singleton;

    //私有化构造方法
    private LazySingletonSecurityBySynchronizedMethod() {}

    //向外提供一个 线程安全的 调用单例对象的方法
    public static synchronized LazySingletonSecurityBySynchronizedMethod getInstance() {

        //先检查单例对象是否为空，保证单例对象只有一个
        if (singleton == null) {
            singleton = new LazySingletonSecurityBySynchronizedMethod();
        }

        return singleton;
    }

}
