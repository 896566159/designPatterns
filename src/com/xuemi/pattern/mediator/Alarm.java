package com.xuemi.pattern.mediator;

/**
 * 闹钟类
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //将自己放在ConcreteMediator的集合中
        mediator.register(name, this);
    }

    public void SendAlarm(int stateCode) {
        sendMassage(stateCode);
    }

    @Override
    public void sendMassage(int stateCode) {
        this.getMediator().getMessgae(stateCode, this.name);
    }
}
