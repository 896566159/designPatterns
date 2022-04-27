package com.xuemi.principle.interfaceSegregationPrinciple;

public class ViolatedDemo {

    public static void main(String[] args) {
        new A().depend1(new B());
        new A().depend2(new B());
        new A().depend3(new B());

        new C().depend1(new D());
        new C().depend4(new D());
        new C().depend5(new D());
    }

}

//案例：
//类A通过interface1 依赖类B，类C通过interface1 依赖类D
interface interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements interface1{

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

//类A通过接口interface1依赖（使用）B类，但是只会使用到方法1、2、3
class A {
    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend2(interface1 i) {
        i.operation2();
    }

    public void depend3(interface1 i) {
        i.operation3();
    }
}

//类 C 通过接口 interface1 依赖（使用）D类，但是只会使用到方法1、4、5
class C {
    public void depend1(interface1 i) {
        i.operation1();
    }

    public void depend4(interface1 i) {
        i.operation4();
    }

    public void depend5(interface1 i) {
        i.operation5();
    }
}