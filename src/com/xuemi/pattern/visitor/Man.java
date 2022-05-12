package com.xuemi.pattern.visitor;

/**
 * 具体的投票人
 * 说明
 * 1. 这里我们使用到了双分派, 即首先在客户端程序中，将具体状态作为参数传递Woman中(第一次分派)
 * 2. 然后Woman 类调用作为参数的 "具体方法" 中方法getWomanResult, 同时将自己(this)作为参数
 *   传入，完成第二次的分派
 */
public class Man extends Person{

    //拿到 投票的选项， 并将自己作为参数，调用 获取投票人结果的方法
    @Override
    public void getChoice(Vote vote) {
        vote.getManVote(this);
    }
}
