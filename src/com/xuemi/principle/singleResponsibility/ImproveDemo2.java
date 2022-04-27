package com.xuemi.principle.singleResponsibility;

public class ImproveDemo2 {

    public static void main(String[] args) {
        new Vehicle1().roadRun("小汽车");
        new Vehicle1().waterRun("航母");
        new Vehicle1().airRun("战斗机");
    }

}

//方式二：将不同的交通工具作为不同的类
//遵循单一原则
//分解类、同时需要修改客户端（调用方）代码
class Vehicle1{
    public void roadRun(String roadVehicle) {
        System.out.println(roadVehicle + "在公路上行驶");
    }

    public void waterRun(String roadVehicle) {
        System.out.println(roadVehicle + "在水面上行驶");
    }

    public void airRun(String roadVehicle) {
        System.out.println(roadVehicle + "在天空中飞");
    }
}
