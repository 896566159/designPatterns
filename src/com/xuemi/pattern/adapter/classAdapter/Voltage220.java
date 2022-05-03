package com.xuemi.pattern.adapter.classAdapter;

/**
 * 表示家庭用电 220V
 */
public class Voltage220 {

    //定义一个方法，表示该类的输出电压是 220V
    public int outVoltage() {
        int src = 220;
        System.out.println("Voltage220 输出电压为" + src);
        return src;
    }

}
