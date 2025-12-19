package com.inho.phyculator.util;

import static com.inho.phyculator.message.ErrorMessage.ARITHMETIC_TIME_ERROR_MESSAGE;

public class ValidChecker {
    public static void timeValidCheck(double time) {
        if (time <= 0d) {
            throw new ArithmeticException(ARITHMETIC_TIME_ERROR_MESSAGE.getMessage());
        }
    }
}
