package com.xuemi.pattern.prototype.improveShallowCopy;

public class Sheep implements Cloneable{

    private String name;
    private Integer age;
    private Integer male;
    private SheepAddress address;

    public Sheep(String name, Integer age, Integer male, SheepAddress address) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.address = address;
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

    public Integer getMale() {
        return male;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    public SheepAddress getAddress() {
        return address;
    }

    public void setAddress(SheepAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone(){
        Sheep clone = null;

        try {
            clone = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
