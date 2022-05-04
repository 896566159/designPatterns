package com.xuemi.pattern.composite;

/**
 * 基础接口或者抽象类
 */
public abstract class OrganizationComponent {

    //基类属性
    private String name;
    private String description;

    //构造器
    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //定义 “管理” 方法, 并默认实现方法
    protected void add(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent) {
        //默认实现
        throw new UnsupportedOperationException();
    }

    //方法print, 做成抽象的, 子类都需要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
