package com.xuemi.pattern.flyweight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite site = factory.getWebSite("微博");
        site.use(new User("Tom", 10));

        WebSite site1 = factory.getWebSite("网站");
        site1.use(new User("Jack", 10));

        WebSite site3 = factory.getWebSite("微信公众号");
        site3.use(new User("Smith", 10));

        WebSite site2 = factory.getWebSite("微博");
        site2.use(new User("Tom", 10));

        System.out.println("池中对象数量:" + factory.getWebSiteNumber());

    }

}
