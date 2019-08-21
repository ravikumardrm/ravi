package com.ravi.assignment.converter;

import com.ravi.assignment.constants.Constants;

public class NumberToWordsConverter {

    public String numberToWords(int inputNumber) {
        StringBuilder inWords = new StringBuilder();
        if (inputNumber == 0) {
            return "zero";
        }
        // handling negative inputNumber
        if (inputNumber < 0) {
            return "minus " + numberToWords(-inputNumber);
        }
        inputNumber = extractNumeral(inputNumber, Constants.MILLION_IN_NUMBER, inWords, Constants.MILLION);
        inputNumber = extractNumeral(inputNumber, Constants.THOUSAND_IN_NUMBER, inWords, Constants.THOUSAND);
        inputNumber = extractNumeral(inputNumber, Constants.HUNDRED_IN_NUMBER, inWords, Constants.HUNDRED);

        if (inputNumber > 0) {
            extractTensAndOnes(inputNumber, inWords);
        }
        return inWords.toString();
    }

    private void extractTensAndOnes(int input, StringBuilder inWords) {
        if (input < 20) {
            inWords.append(Constants.unitsArray[input]);
        } else {
            inWords.append(Constants.tensArray[input / 10]);
            if ((input % 10) > 0) {
                inWords.append(" ").append(Constants.unitsArray[input % 10]);
            }
        }
    }

    private int extractNumeral(int inputNumber, int numeral, StringBuilder inWords, String numeralName) {
        if ((inputNumber / numeral) > 0) {
            inWords.append(numberToWords(inputNumber / numeral)).append(numeralName);
            inputNumber %= numeral;
        }
        return inputNumber;
    }
}
