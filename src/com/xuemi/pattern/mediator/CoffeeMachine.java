package com.xuemi.pattern.mediator;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMassage(int stateCode) {
        this.getMediator().getMessgae(stateCode, this.name);
    }

    public void StartCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee() {
        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMassage(0);
    }
}

