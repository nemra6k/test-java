package com.example.helloworld;

public class SubA extends MyBase {
    public SubA() {
        System.out.println("->SubA");
    }

    @Override
    public int func() {
        super.func();
        System.out.println("->SubA::func");

        return  2;
    }

    @Override
    public String toString() {
        return "SubA{}";
    }
}
