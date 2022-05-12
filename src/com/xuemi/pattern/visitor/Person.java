package com.xuemi.pattern.visitor;

/**
 * 投票人
 */
public abstract class Person {

    //投票人获得投票的选项——通过、不通过。。。
    public abstract void getChoice(Vote vote);

}
