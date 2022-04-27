package com.xuemi.principle.singleResponsibility;

public class ImproveDemo1 {

    public static void main(String[] args) {
        new RoadVehicle().run("小汽车");
        new WaterVehicle().run("航母");
        new AirVehicle().run("战斗机");
    }

}

//方式一：将不同的交通工具作为不同的类
//遵循单一原则
//分解类、同时需要修改客户端（调用方）代码
class RoadVehicle{
    public void run(String roadVehicle) {
        System.out.println(roadVehicle + "在公路上行驶");
    }
}

class WaterVehicle{
    public void run(String waterVehicle) {
        System.out.println(waterVehicle + "在水面上行驶");
    }
}

class AirVehicle{
    public void run(String airVehicle) {
        System.out.println(airVehicle + "在天空中飞");
    }
}
