package com.xuemi.pattern.state;

import java.util.Random;

/**
 * 奖品已经被抽完， 活动结束
 */
public class DispenseOutState implements State{
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 抽奖活动奖品已经抽完，活动结束，不能扣积分了
    @Override
    public void deductMoney() {
        System.out.println("奖品已抽完，活动结束");
    }

    // 抽奖活动奖品已经抽完，活动结束，不能抽奖了
    @Override
    public boolean raffle() {
        System.out.println("奖品已抽完，活动结束");
        return false;
    }

    // 抽奖活动奖品已经抽完，活动结束，不能领奖了
    @Override
    public void dispensePrize() {
        System.out.println("奖品已抽完，活动结束");
    }
}
