package com.xuemi.pattern.adapter.classAdapter;

/**
 * 手机类
 */
public class Phone {

    public void charging(IVoltage5 iVoltage5) {
        if (iVoltage5.transform() == 5) {
            System.out.println("手机可以充电");
        } else {
            System.out.println("电压不符合手机电压标准，充电失败");
        }
    }

}
