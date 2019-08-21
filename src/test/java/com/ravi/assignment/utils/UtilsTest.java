package com.ravi.assignment.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalculateTotalDigits() {
        Assert.assertEquals(8, Utils.calculateTotalDigits(12345678));
        Assert.assertEquals(9, Utils.calculateTotalDigits(-123456789));
    }
}