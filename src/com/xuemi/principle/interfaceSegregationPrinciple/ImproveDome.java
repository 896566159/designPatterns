package com.xuemi.principle.interfaceSegregationPrinciple;

public class ImproveDome {
    public static void main(String[] args) {
        new AA().depend1(new BB());
        new AA().depend2(new BB());
        new AA().depend3(new BB());

        new CC().depend1(new DD());
        new CC().depend4(new DD());
        new CC().depend5(new DD());
    }

}

//违反接口隔离原则原因：
    //类A 通过接口interface1 依赖 类B， 类C 通过接口 interface1 依赖 类D，
    // 如果interface1 对于 类A和类C来说不是最小接口，则类B和类D需要去实现他们不需要的方法
//解决方案：
    //将 interface1 拆分成几个独立的接口，类A和类C分别与他们所需要的接口建立依赖关系。即采用接口隔离原则
interface interface2 {
    void operation1();
}

interface interface3 {
    void operation2();

    void operation3();
}

interface interface4 {
    void operation4();

    void operation5();
}

class BB implements interface2, interface3 {

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
}

class DD implements interface4, interface2 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
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

//类A通过interface2、interface3接口依赖类B
class AA {
    public void depend1(interface2 i) {
        i.operation1();
    }

    public void depend2(interface3 i) {
        i.operation2();
    }

    public void depend3(interface3 i) {
        i.operation3();
    }
}

//类C 通过interface2、interface4 接口依赖类D
class CC {
    public void depend1(interface2 i) {
        i.operation1();
    }

    public void depend4(interface4 i) {
        i.operation4();
    }

    public void depend5(interface4 i) {
        i.operation5();
    }
}