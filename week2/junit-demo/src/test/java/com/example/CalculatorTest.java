package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed.");
    }

    @Test
    public void testAddition() {

        int a = 10, b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int a = 10, b = 3;

        int result = calculator.subtract(a, b);

        assertEquals(7, result);
    }

    @Test
    public void testMultiplication() {

        int a = 4, b = 3;

        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(12, result);
    }
}

