package com.xuemi.pattern.composite;

/**
 * 叶子节点类
 */
public class Department extends OrganizationComponent{

    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }


    //add , remove 就不用写了，因为他是叶子节点

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
