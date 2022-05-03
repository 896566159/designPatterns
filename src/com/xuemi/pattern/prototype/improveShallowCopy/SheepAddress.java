package com.xuemi.pattern.prototype.improveShallowCopy;

public class SheepAddress{

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
}
