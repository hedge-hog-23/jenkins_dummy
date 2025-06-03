package com.example.factorial;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(120, Factorial.compute(5));
        assertEquals(1, Factorial.compute(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial.compute(-1);
    }
}
