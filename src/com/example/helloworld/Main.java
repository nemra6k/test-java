package com.example.helloworld;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java!");

        classes();
        interfaces();
    }

    private static void classes() {
        System.out.println("***Testing classes");
        MyBase base = new MyBase();
        SubA a = new SubA();
        SubB b = new SubB();
        base.func();
        a.func();
        b.func();
        System.out.println("Classes: " + base + ", " + a + ", " + b);
    }

    private static void interfaces() {
        System.out.println("***Testing interface");
        ImplementIfc ifc = new ImplementIfc();
        ifc.f1();
        ifc.f2();
    }
}
