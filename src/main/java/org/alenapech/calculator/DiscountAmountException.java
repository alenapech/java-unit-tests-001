package org.alenapech.calculator;

public class DiscountAmountException extends IllegalArgumentException {
    public DiscountAmountException() {
        super("Incorrect Discount Amount. Please check");
    }
}
