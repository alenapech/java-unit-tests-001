package org.alenapech.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new PurchaseAmountException();
        if (discountAmount < 0 || discountAmount > 100)
            throw  new DiscountAmountException();
        double result = purchaseAmount * ((100 - (double) discountAmount) / 100);
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}