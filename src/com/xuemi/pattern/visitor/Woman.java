package com.xuemi.pattern.visitor;

/**
 * 具体的投票人
 */
public class Woman extends Person{
    @Override
    public void getChoice(Vote vote) {
        vote.getWomanVote(this);
    }
}
