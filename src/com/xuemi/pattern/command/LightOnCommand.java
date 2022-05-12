package com.xuemi.pattern.command;

/**
 * 点灯开命令类
 */
public class LightOnCommand implements Command {

    //定义一个 电灯（命令执行者）
    Light light;

    //通过构造器初始化 执行者
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
