package com.xuemi.pattern.command;

/**
 * 命令接口
 */
public interface Command {

    //定义一个 execute、undo 方法
    public void execute();

    public void undo();

}
