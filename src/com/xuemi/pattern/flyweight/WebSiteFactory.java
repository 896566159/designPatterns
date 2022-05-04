package com.xuemi.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    //使用map来充当 池 的作用
    Map<String, ConcreteWebSite> map = new HashMap<>();

    //如果池没有对象，就创建一个，并返回
    public WebSite getWebSite(String type) {

        //如果池没有对象，就创建一个
        if (!map.containsKey(type)) {
            map.put(type, new ConcreteWebSite(type));
        }

        return (WebSite) map.get(type);
    }

    //返回池中有多少个对象
    public int getWebSiteNumber() {
        return map.size();
    }

}
