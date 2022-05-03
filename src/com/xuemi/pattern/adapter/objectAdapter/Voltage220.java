package com.xuemi.pattern.adapter.objectAdapter;

/**
 * 家用电 220V
 */
public class Voltage220 {

    public int outputVoltage() {
        int src = 220;

        System.out.println("家用电输出电压为 " + src + "V");

        return src;
    }

}
