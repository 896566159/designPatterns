package com.xuemi.pattern.adapter.objectAdapter;

/**
 * 适配器类：将家用电转换成为手机可以使用的电压
 * 通过 聚合 的方式将家用电的电压作为成员变量
 */
public class ObjectAdapter implements IVoltage5{

    Voltage220 voltage220 = new Voltage220();

    @Override
    public int outputVoltage() {
        int src = voltage220.outputVoltage();
        int dest = src / 44;
        System.out.println("手机充电适配器将家用 " + src + "V 电压降为 " + dest + "V");
        return dest;
    }
}
