package com.xuemi.pattern.builder.improve;

public class Clenit {

    public static void main(String[] args) {

        CommonHouse commonHouse = new CommonHouse();
        BuilderDirector director = new BuilderDirector(commonHouse);
        House house = director.buildHouse();

        System.out.println("_______________________________");
        HighHouse highHouse = new HighHouse();
        director.setBuilder(highHouse);
        director.buildHouse();
    }

}
