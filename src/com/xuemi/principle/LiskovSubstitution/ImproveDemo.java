package com.xuemi.principle.LiskovSubstitution;

public class ImproveDemo {

    public static void main(String[] args) {
        AA a1 = new AA();
        BB a2 = new BB();
        System.out.println(a1.func1(11, 5));
        System.out.println(a2.func3(11, 5));
    }

}

//解决方案：原来的父类和子类都继承一个更抽象的类，原有的继承关系去掉，采用依赖、聚合。组合替代继承
class Base {
    //把更加基础的方法和成员写道Base类中
}

class AA extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class BB extends Base {
//    使用组合方式替换继承关系
    AA a = new AA();

    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    //仍然可以使用A类的方法
    public int func3(int num1, int num2) {
        return a.func1(num1, num2);
    }

    public int func2(int num1, int num2) {
        return num1 + num2 + 9;
    }
}
