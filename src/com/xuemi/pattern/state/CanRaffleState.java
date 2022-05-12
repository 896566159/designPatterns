package com.xuemi.pattern.state;

import java.util.Random;

/**
 * 不能抽奖状态类
 */
public class CanRaffleState implements State{
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 已经扣过了积分
    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分");
    }

    // 已经扣过积分，可以抽奖
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖！");
        Random random = new Random();
        int num = random.nextInt(10);

        //20%中奖几率
        if (num < 2) {
            //改变活动状态为 发放奖品 context
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    // 当前状态不能发奖品
    @Override
    public void dispensePrize() {
        System.out.println("正在抽奖，还不能发放奖品");
    }
}
