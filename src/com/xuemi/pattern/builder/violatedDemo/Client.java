package com.xuemi.pattern.builder.violatedDemo;

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        HighHouse highHouse = new HighHouse();
        highHouse.build();
    }

}
