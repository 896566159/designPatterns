package com.xuemi.pattern.memento;

public class Originator {

    //状态信息
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //保存一个状态对象 Memento
    public Memento saveState() {
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

}
