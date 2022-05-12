package com.xuemi.pattern.command;

/**
 * 电视 开 命令类
 */
public class TVOffCommand implements Command{

    //组合一个TV对象
    TV tv;

    //通过构造器初始化tv对象
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    //让 执行者 执行 excute命令
    @Override
    public void execute() {
        tv.off();
    }

    //让 执行者 执行 undo命令
    @Override
    public void undo() {
        tv.on();
    }
}
