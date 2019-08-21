package com.ravi.assignment.converter;

import com.ravi.assignment.converter.NumberToWordsConverter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberToWordsConverterTest {
    private NumberToWordsConverter numberToWordsMock;

    @Before
    public void setUp() {
        numberToWordsMock = new NumberToWordsConverter();
    }

    @Test
    public void testConvertNumberToString() {
        Assert.assertEquals("zero", numberToWordsMock.numberToWords(0));
        Assert.assertEquals("one", numberToWordsMock.numberToWords(1));
        Assert.assertEquals("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine",
                numberToWordsMock.numberToWords(999999999));
        Assert.assertEquals("minus nine thousand nine hundred ninety",
                numberToWordsMock.numberToWords(-9990));
        Assert.assertEquals("two thousand five hundred ",
                numberToWordsMock.numberToWords(2500));
    }

    @After
    public void tearDown() {
        numberToWordsMock = null;
    }
}