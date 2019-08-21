package com.ravi.assignment.input.reader;

import com.ravi.assignment.exception.InvalidNumberException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class InputReaderTest {
   private InputReader inputReaderMock = null;

    @Before
    public void setUp()  {
        inputReaderMock = new InputReader();
    }

    @After
    public void tearDown()  {
        inputReaderMock = null;
    }

    @Test(expected = InvalidNumberException.class)
    public void testReadNumberAndValidateNAN() throws InvalidNumberException {
        String data = "nan";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        inputReaderMock.readNumberAndValidate();
    }

    @Test(expected = InvalidNumberException.class)
    public void testReadNumberAndValidateMorethan9Digits() throws InvalidNumberException {
        String data = "1234567890";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        inputReaderMock.readNumberAndValidate();
    }

    @Test
    public void testReadNumberAndValidate() throws InvalidNumberException {
        String data = "123456789";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Assert.assertEquals(123456789, inputReaderMock.readNumberAndValidate());
    }
}