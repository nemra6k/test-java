package com.example.helloworld;

public class MyBase {
    public MyBase() {
        super();
        System.out.println("MyBase constructor");
    }

    public int func() {
        System.out.println("MyBase->func");
        return 1;
    }

    @Override
    public String toString() {
        return "MyBase{}";
    }

}

