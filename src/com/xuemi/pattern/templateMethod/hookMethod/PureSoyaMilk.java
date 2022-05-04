package com.xuemi.pattern.templateMethod.hookMethod;

/**
 * 纯豆浆、原味豆浆
 */
public class PureSoyaMilk extends AbsSoyaMilk{

    //改写 父类判断是否是 原味豆浆的方法
    @Override
    public boolean isNotPure() {
        return false;
    }

    //原味豆浆不需要加调味料，方法为空即可
    @Override
    void addCondiment() {

    }
}
