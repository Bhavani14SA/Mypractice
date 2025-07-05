package com.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down test...");
        calculator = null;
    }

    @Test
    public void testAddition() {

        int a = 5;
        int b = 3;

        int result = calculator.add(a, b);

        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {

        int a = 10;
        int b = 4;

        int result = calculator.subtract(a, b);

        assertEquals(6, result);
    }
}
