package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubBTest {

    @Test
    void func() {
        SubB b = new SubB();
        assertEquals(
                3, b.func()
        );
    }
}