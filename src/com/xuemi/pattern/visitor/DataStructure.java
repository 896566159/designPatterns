package com.xuemi.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

//数据结构，管理很多人（Man , Woman）
public class DataStructure {

    //集合， 用于记录投票人的投票结果
    private List<Person> persons = new ArrayList<>();

    //增加到集合中
    public void attach(Person p) {
        persons.add(p);
    }

    //从集合中移除
    public void detach(Person p) {
        persons.add(p);
    }

    //显示测评情况
    public void display(Vote vote) {
        for(Person p: persons) {
            p.getChoice(vote);
        }
    }
}
