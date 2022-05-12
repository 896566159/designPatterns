package com.xuemi.pattern.mediator;

/**
 * 同事类， 将自己的事情托付给 中介者
 */
public abstract class Colleague {

    //中介者
    private Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    //获取该同事类的中介者
    public Mediator getMediator() {
        return this.mediator;
    }

    //向其他 同事类对象 发送消息
    public abstract void sendMassage(int stateCode);

}
