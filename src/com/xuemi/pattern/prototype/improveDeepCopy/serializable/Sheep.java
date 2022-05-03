package com.xuemi.pattern.prototype.improveDeepCopy.serializable;

import java.io.*;

public class Sheep implements Serializable {

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

    //通过序列化和反序列化实现深拷贝
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep deepCopy = (Sheep)ois.readObject();

            return deepCopy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                //关闭流
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
