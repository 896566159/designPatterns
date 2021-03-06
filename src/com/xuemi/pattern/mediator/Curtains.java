package com.xuemi.pattern.mediator;

public class Curtains extends Colleague{

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMassage(int stateChange) {
        this.getMediator().getMessgae(stateChange, this.name);
    }

    public void UpCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}
