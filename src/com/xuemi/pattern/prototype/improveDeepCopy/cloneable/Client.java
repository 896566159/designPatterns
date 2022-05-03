package com.xuemi.pattern.prototype.improveDeepCopy.cloneable;

import com.xuemi.pattern.prototype.improveDeepCopy.cloneable.Sheep;
import com.xuemi.pattern.prototype.improveDeepCopy.cloneable.SheepAddress;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        SheepAddress address = new SheepAddress("浙江省", "杭州市");
        Sheep tom = new Sheep("tom", 10, address);

        //拷贝一只和Tom属性值一样的Sheep对象
        Sheep tom1 = (Sheep) tom.clone();

        System.out.println(tom == tom1);
        System.out.println(tom);
        System.out.println(tom1);
        System.out.println("tom" + tom.hashCode());
        System.out.println("tom1" + tom1.hashCode());
        System.out.println("tom.friend" + tom.getAddress().hashCode());
        System.out.println("tom1.friend" + tom1.getAddress().hashCode());
        System.out.println(tom.getAddress() == tom1.getAddress());


    }
}
