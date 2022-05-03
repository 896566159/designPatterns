package com.xuemi.pattern.prototype.improveDeepCopy.cloneable;

public class Sheep implements Cloneable{

    private String name;
    private Integer age;
    private SheepAddress address;

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SheepAddress getAddress() {
        return address;
    }

    public void setAddress(SheepAddress address) {
        this.address = address;
    }

    public Sheep(String name, Integer age, SheepAddress address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //克隆返回对象
        Sheep deep = (Sheep) super.clone();
        //克隆引用数据类型属性
        deep.address = (SheepAddress) address.clone();

        return deep;
    }
}
