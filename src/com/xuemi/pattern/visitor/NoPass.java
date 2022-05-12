package com.xuemi.pattern.visitor;

/**
 * 具体投票
 */
public class NoPass extends Vote{

    @Override
    public void getManVote(Man man) {
        System.out.println("男性给予不通过");
    }

    @Override
    public void getWomanVote(Woman woman) {
        System.out.println("女性给予不通过");
    }
}
