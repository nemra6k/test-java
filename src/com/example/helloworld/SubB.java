package com.example.helloworld;

public class SubB extends SubA {
    public SubB() {
        System.out.println("->SubB");
    }

    @Override
    public int func() {
        super.func();
        System.out.println("->SubB::func");
        return 3;
    }

    @Override
    public String toString() {
        return "SubB{}";
    }
}
