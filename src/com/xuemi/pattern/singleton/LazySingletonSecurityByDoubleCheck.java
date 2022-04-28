package com.xuemi.pattern.singleton;

/**
 * 懒汉式——双重检查
 * Double-check是多线程开发中常使用的手段，检查了两次 singleton 对象，可以保证线程安全
 * 线程安全，延迟加载，效率高
 * 在实际开发中，推荐使用该方式
 */
public class LazySingletonSecurityByDoubleCheck {

    //私有化对象
    private static volatile LazySingletonSecurityByDoubleCheck singleton;

    //私有化构造方法
    private LazySingletonSecurityByDoubleCheck(){}

    //向外提供调用对象的方法
    public LazySingletonSecurityByDoubleCheck getInstance() {

        //双重检查
        if (singleton == null) {
            synchronized (LazySingletonSecurityByDoubleCheck.class) {
                if (singleton == null) {
                    singleton = new LazySingletonSecurityByDoubleCheck();
                }
            }
        }

        return singleton;
    }
}
