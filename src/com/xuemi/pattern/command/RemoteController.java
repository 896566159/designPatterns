package com.xuemi.pattern.command;

/**
 * 家电遥控器
 */
public class RemoteController {

    //两个数组：开、关
    Command[] onCommands;
    Command[] offCommands;

    //一个撤销按钮
    Command undoCommand;

    //初始化遥控器的按钮数量
    public RemoteController() {
        offCommands = new Command[5];
        onCommands = new Command[5];

        //初始化每一个按钮都是空的
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //将 按钮与命令 绑定
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下 开on 按钮
    public void onButtonPushed(int no) {
        // 找到你按下的开的按钮， 并调用对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    //按下 关off 按钮
    public void offButtonPushed(int no) {
        // 找到你按下的开的按钮， 并调用对应方法
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonPushed() {
        undoCommand.undo();
    }

}
