package com.xuemi.principle.LiskovSubstitution;

public class ViolatedDemo {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        System.out.println(a1.func1(11, 5));
        System.out.println(a2.func1(11, 5));
    }

}

//B类继承了A类，但是对A中减法的方法进行了修改，导致A和他的子类的方法一运行效果不一致
class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {

    //重写了fun1方法
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return num1 - num2 + 9;
    }
}
