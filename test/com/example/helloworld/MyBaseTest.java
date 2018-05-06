package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBaseTest {

    @Test
    void func() {
        MyBase base = new MyBase();
        assertEquals(base.func(),1);
    }
}