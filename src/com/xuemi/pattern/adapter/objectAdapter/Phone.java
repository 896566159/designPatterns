package com.xuemi.pattern.adapter.objectAdapter;

/**
 * 手机类
 */
public class Phone {

    /**
     * 手机充电方法
     * @param iVoltage5 手机充电需要的电压
     */
    public void charging(IVoltage5 iVoltage5) {
        if (iVoltage5.outputVoltage() == 5) {
            System.out.println("电压符合，开始充电");
        } else {
            System.out.println("电压不符合，充电失败");
        }
    }

}
