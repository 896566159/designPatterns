package com.xuemi.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    //在集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //获取到第 index 个 Originator  的备忘录对象（及保存状态）
    public Memento get(int index) {
        return mementoList.get(index);
    }

}
