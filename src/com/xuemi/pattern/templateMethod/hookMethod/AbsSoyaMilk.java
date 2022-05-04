package com.xuemi.pattern.templateMethod.hookMethod;

/**
 * 模板方法中的抽象类
 */
public abstract class AbsSoyaMilk {

    //声明一个方法，该方法是不同口味豆浆的制作通用流程，
    //豆浆通用流程：选材、加料、浸泡、研磨
    //纯豆浆 不需要第二个步骤，不需要加入调味料
    public void soyaMakingTemplateMethod() {
        select();
        //如果不是纯豆浆，则不需要加入调味料
        if (isNotPure()) {
            addCondiment();
        }
        soak();
        materialGrind();
    }

    //判断要做的豆浆是否是 纯豆浆，默认不是纯豆浆
    public boolean isNotPure() {
        return true;
    }

    //选择黄豆
    public void select() {
        System.out.println("选择饱满的黄豆");
    }

    //根据不同口味选择调味材料：如红豆（红豆味豆浆）、花生（花生味豆浆）
    //这一个步骤实现与具体得口味豆浆有关系，所以交给子类去实现
    abstract void addCondiment();

    //将黄豆和材料一起浸泡
    public void soak() {
        System.out.println("浸泡黄豆和调味料2小时");
    }

    //豆浆研磨
    public void materialGrind() {
        System.out.println("黄豆和调味料一起研磨");
    }

}
