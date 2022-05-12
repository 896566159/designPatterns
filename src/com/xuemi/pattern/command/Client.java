package com.xuemi.pattern.command;

public class Client {

    public static void main(String[] args) {

        //创建一个遥控器对象（命令执行者与命令发布者之间的桥梁）
        RemoteController remoteController = new RemoteController();

        //创建一个 电灯（执行者）对象
        Light light = new Light();

        //创建一个电灯开、关的对象
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        //设置遥控器的第一个按钮为电灯的控制器
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("—————————————————按下电灯开按钮———————————————————");
        remoteController.onButtonPushed(0);
        System.out.println("—————————————————按下电灯关按钮———————————————————");
        remoteController.offButtonPushed(0);
        System.out.println("—————————————————按下撤销按钮———————————————————");
        remoteController.undoButtonPushed();

        System.out.println("************************");

        //创建一个 电视（执行者）对象
        TV tv = new TV();

        //创建一个电灯开、关的对象
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvtOffCommand = new TVOffCommand(tv);

        //设置遥控器的第二个按钮为电灯的控制器
        remoteController.setCommand(1, tvOnCommand, tvtOffCommand);

        System.out.println("—————————————————按下电灯开按钮———————————————————");
        remoteController.onButtonPushed(1);
        System.out.println("—————————————————按下电灯关按钮———————————————————");
        remoteController.offButtonPushed(1);
        System.out.println("—————————————————按下撤销按钮———————————————————");
        remoteController.undoButtonPushed();
    }

}
