package com.xuemi.pattern.state;

import java.util.Random;

/**
 * 发放奖品状态类
 */
public class DispenseState implements State{
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 已经扣过了积分，抽了奖
    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分");
    }

    // 已经扣过积分，抽了奖
    @Override
    public boolean raffle() {
        System.out.println("已经抽过了奖品");
        return false;
    }

    // 方法奖品
    @Override
    public void dispensePrize() {

        if (activity.getCount() > 1) {
            System.out.println("正在发放奖品");
            //改变状态为 不能抽奖
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完了");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            activity.setState(activity.getDispenseOutState());
            System.out.println("抽奖活动结束");
            System.exit(0);
        }
    }
}
