package com.xuemi.pattern.prototype.improveShallowCopy;

public class Client {

    public static void main(String[] args) {
        SheepAddress address = new SheepAddress("浙江省", "温州市");
        Sheep tom = new Sheep("tom", 10, 1, address);

        //拷贝一只和Tom属性值一样的Sheep对象
        Sheep tom1 = (Sheep) tom.clone();

        System.out.println(tom == tom1);
        System.out.println(tom);
        System.out.println(tom1);
        System.out.println("tom" + tom.hashCode());
        System.out.println("tom1" + tom1.hashCode());
        System.out.println("tom.Address = " + tom.getAddress().hashCode());
        System.out.println("tom1.address = " + tom1.getAddress().hashCode());
        System.out.println(tom.getAddress() == tom1.getAddress());

    }
}
