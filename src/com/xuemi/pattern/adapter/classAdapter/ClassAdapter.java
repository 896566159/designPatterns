package com.xuemi.pattern.adapter.classAdapter;

/**
 * 手机的充电头——可将家用电输出的 220V 降到 5V
 */
public class ClassAdapter extends Voltage220 implements IVoltage5{

    @Override
    public int transform() {
        //220V的电压通过 继承extend 关系，调用outVoltage方法即可得到220V电压
        int src = outVoltage();
        int dest = src / 44; //通过 手机充电头 将家用电压 降为 5V输出
        System.out.println("手机充电适配器将家用电压 " + src + "V 降为" + dest + "V");
        return dest;
    }

}
