package com.ravi.assignment.utils;

public class Utils {

    public static int calculateTotalDigits(int number) {
        int digits = 0;
        if (number < 0) {
            number = -number;
        }
        while (number > 0) {
            number = number / 10;
            digits++;
        }
        return digits;
    }
}
