package com.xuemi.pattern.bridge;

public class Client {

    public static void main(String[] args) {
        FoldedPhone huaweiFolded = new FoldedPhone(new HuaWeiPhone());
        huaweiFolded.open();
        huaweiFolded.close();
        huaweiFolded.call();

        System.out.println("******************************");

        UprightPhone appleUpright = new UprightPhone(new ApplePhone());
        appleUpright.open();
        appleUpright.close();
        appleUpright.call();
    }

}
