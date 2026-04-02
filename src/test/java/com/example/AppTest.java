package com.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCheckOddEven() {
        assertEquals("Even", App.checkOddEven(10));
        assertEquals("Odd", App.checkOddEven(7));
    }

    @Test
    public void testSumDigits() {
        assertEquals(6, App.sumDigits(123)); 
        assertEquals(10, App.sumDigits(505)); 
    }

    @Test
    public void testReverseNumber() {

        assertEquals(321, App.reverseNumber(123));
        assertEquals(-4321, App.reverseNumber(-1234));
    }
}
