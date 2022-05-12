package com.xuemi.pattern.visitor;

/**
 * 投票
 */
public abstract class Vote {

    //获取男人的投票结果
    public abstract void getManVote(Man man);

    //获取女人的投票结果
    public abstract void getWomanVote(Woman woman);

}
