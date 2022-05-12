package com.xuemi.pattern.state;

/**
 * 状态类
 */
public interface State {

    //扣除积分
    public abstract void deductMoney();

    //是否抽中奖
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrize();
}
