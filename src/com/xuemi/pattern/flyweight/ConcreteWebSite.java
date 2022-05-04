package com.xuemi.pattern.flyweight;

public class ConcreteWebSite extends WebSite{

    //网站发布方式
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println(user.getName() + " 正在使用 " + type + " 方式进行网站发布");
    }

}
