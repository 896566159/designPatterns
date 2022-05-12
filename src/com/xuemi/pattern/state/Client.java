package com.xuemi.pattern.state;

public class Client {

    public static void main(String[] args) {

        //创建抽奖类，设置奖品数量为3
        RaffleActivity activity = new RaffleActivity(3);

        // 我们连续抽300次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deductMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }

}
