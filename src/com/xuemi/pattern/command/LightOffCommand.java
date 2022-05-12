package com.xuemi.pattern.command;

/**
 * 点灯开命令类
 */
public class LightOffCommand implements Command {

    //定义一个 电灯（命令执行者）
    Light light;

    //通过构造器初始化 执行者
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
