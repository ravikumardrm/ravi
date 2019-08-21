package com.ravi.assignment.app;

import com.ravi.assignment.converter.NumberToWordsConverter;
import com.ravi.assignment.exception.InvalidNumberException;
import com.ravi.assignment.input.reader.InputReader;

public class App {

    public static void main(String[] args) {
        try {
            InputReader inputReader = new InputReader();
            NumberToWordsConverter numberToWords = new NumberToWordsConverter();
            int inputNumber = inputReader.readNumberAndValidate();
            String words = numberToWords.numberToWords(inputNumber);
            System.out.println(inputNumber + " in words: " + words);
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
