package com.xuemi.principle.singleResponsibility;

public class ViolatedDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run("汽车");
        vehicle.run("卡车");
        vehicle.run("飞机");
    }
}

//违背单一责任原因分析：
//在run方法中，违反了单一原则
//解决方案：应该将不同的交通工具分为不同的类
class Vehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上行驶");
    }
}