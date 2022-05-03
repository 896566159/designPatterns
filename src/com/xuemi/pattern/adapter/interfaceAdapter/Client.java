package com.xuemi.pattern.adapter.interfaceAdapter;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        //在具体的子类创建时，采用挑选性的实现方法
        MyAbstractAdapter adapter = new MyAbstractAdapter() {

            @Override
            public void method1() {
                System.out.println("具体的子类中实现了方法1");
            }

            @Override
            public void method2() {
                System.out.println("具体的子类中实现了方法2");
            }
        };

        adapter.method1();
        adapter.method2();
    }
}
