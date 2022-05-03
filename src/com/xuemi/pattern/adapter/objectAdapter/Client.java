package com.xuemi.pattern.adapter.objectAdapter;

public class Client {

    public static void main(String[] args) {
        new Phone().charging(new ObjectAdapter());
    }

}
