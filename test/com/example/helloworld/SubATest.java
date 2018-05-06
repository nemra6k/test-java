package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubATest {

    @Test
    void func() {
        SubA a = new SubA();
        assertEquals(2,a.func());
    }
}