package com.xuemi.pattern.visitor;

/**
 * 通过票类
 */
public class Pass extends Vote{
    @Override
    public void getManVote(Man man) {
        System.out.println("男性给予通过");
    }

    @Override
    public void getWomanVote(Woman woman) {
        System.out.println("女性给予通过");
    }
}
