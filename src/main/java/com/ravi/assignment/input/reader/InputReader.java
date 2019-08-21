package com.ravi.assignment.input.reader;

import com.ravi.assignment.exception.InvalidNumberException;
import com.ravi.assignment.utils.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    public int readNumberAndValidate() throws InvalidNumberException {
        int number;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please type a number(max upto 9 digits)");
            number = scanner.nextInt();
            int digits = Utils.calculateTotalDigits(number);
            if (digits > 9) {
                throw new InvalidNumberException("Entered number has more than 9 digits");
            }
        } catch (InputMismatchException e) {
            throw new InvalidNumberException("Entered number is not valid 9 digit number");
        }
        return number;
    }
}
