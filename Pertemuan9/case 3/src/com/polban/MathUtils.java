package com.polban;

public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Factorial is only defined for integers up to 16 due to overflow.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}



