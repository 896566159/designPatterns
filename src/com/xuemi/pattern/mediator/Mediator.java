package com.xuemi.pattern.mediator;

//中介者 接口
public interface Mediator {

    //将Colleague对象加入到集合中
    public abstract void register(String name, Colleague colleague);

    //接受 别的Colleague对象 发送的消息
    public abstract void getMessgae(int stateCode, String colleagueName);

    // 发送信息
    public abstract void sendMessgae();
}
