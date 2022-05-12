package com.xuemi.pattern.iterator;

import java.util.Iterator;

/**
 * 学院接口
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器
    public Iterator getIterator();

}
