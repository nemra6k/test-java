package com.example.helloworld;

public class ImplementIfc implements MyInterface {
    /**
     *
     *
     */
    @Override
    public void f1() {
       System.out.println("f1 implementation");
    }

    @Override
    public void f2() {
        System.out.println("f2 implementation");
    }
}
