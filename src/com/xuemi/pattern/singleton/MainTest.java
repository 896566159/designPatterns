package com.xuemi.pattern.singleton;

import org.junit.Test;

public class MainTest {

    @Test
    public void EagerSingletonByStaticConstTest() {
        EagerSingletonByStaticConst instance1 = EagerSingletonByStaticConst.getInstance();
        EagerSingletonByStaticConst instance2 = EagerSingletonByStaticConst.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void EagerSingletonByStaticCodeBlockTest() {
        EagerSingletonByStaticCodeBlock instance1 = EagerSingletonByStaticCodeBlock.getInstance();
        EagerSingletonByStaticCodeBlock instance2 = EagerSingletonByStaticCodeBlock.getInstance();

        System.out.println(instance1.getClass());
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void LazySingletonNotSecurityTest() {
        LazySingletonNotSecurity instance1 = LazySingletonNotSecurity.getInstance();
        LazySingletonNotSecurity instance2 = LazySingletonNotSecurity.getInstance();

        System.out.println(instance1.getClass());
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void LazySingletonSecurityByTest() {
        LazySingletonSecurityBySynchronizedMethod instance1 = LazySingletonSecurityBySynchronizedMethod.getInstance();
        LazySingletonSecurityBySynchronizedMethod instance2 = LazySingletonSecurityBySynchronizedMethod.getInstance();

        System.out.println(instance1.getClass());
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void LazySingletonSecurityByInnerClassTest() {
        LazySingletonSecurityByInnerClass instance1 = LazySingletonSecurityByInnerClass.getInstance();
        LazySingletonSecurityByInnerClass instance2 = LazySingletonSecurityByInnerClass.getInstance();

        System.out.println(instance1.getClass());
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

    @Test
    public void SingletonByEnumTest() {
        SingletonByEnum instance1 = SingletonByEnum.SINGLETON;
        SingletonByEnum instance2 = SingletonByEnum.SINGLETON;

        System.out.println(instance1.getClass());
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
