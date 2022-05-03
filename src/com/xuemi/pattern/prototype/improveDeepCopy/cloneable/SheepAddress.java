package com.xuemi.pattern.prototype.improveDeepCopy.cloneable;

public class SheepAddress implements Cloneable{

    private String province;
    private String city;

    @Override
    public String toString() {
        return "SheepAddress{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public SheepAddress(String province, String city) {
        this.province = province;
        this.city = city;
    }

    //在该类中，成员变量都是String，直接使用Object的基类中的clone()方法即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
