package com.xuemi.pattern.singleton;

/**
 * 单例模式——使用枚举类型实现
 * JDK1.5中添加的枚举类型，避免了多线程同步问题，防止反序列化重新创建新的对象
 * 推荐使用
 */
public enum SingletonByEnum {

    SINGLETON;//属性

    public void test() {
        System.out.println("Enum Singleton");
    }

}
