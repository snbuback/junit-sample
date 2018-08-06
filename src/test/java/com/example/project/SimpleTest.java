package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SimpleTest {

    @Test
    public void testPass() {
        assertTrue(true);
    }

    @Test
    public void testFail() {
        // assertTrue(false);
    }

    @Test
    @Disabled
    public void testError() {
        throw new IllegalArgumentException("invalid value");
    }
}