package com.xuemi.pattern.state;

public class RaffleActivity {

    //活动状态，是变化的
    State state = null;
    //奖品数量
    int count = 0;

    //四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseOutState = new DispenseOutState(this);
    State dispenseState = new DispenseState(this);



    // 构造器，
    // 1.初始化当前的状态为 不可抽奖状态
    // 2.设置奖品的数量
    public RaffleActivity(int count) {
        this.count = count;
        state = noRaffleState;
    }

    //扣分后，当前状态设置为 deductMoney
    public void deductMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle() {
        //如果当前的状态是抽奖成功
        if (state.raffle()) {
            //领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //奖品领取后奖品数量要 减一
    public int getCount() {
        int cur = count;
        count--;
        return cur;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public State getDispenseState() {
        return dispenseState;
    }
}
