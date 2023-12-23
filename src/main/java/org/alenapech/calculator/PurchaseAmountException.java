package org.alenapech.calculator;

public class PurchaseAmountException extends IllegalArgumentException {
    public PurchaseAmountException() {
        super("Incorrect Purchase Amount. Please check");
    }
}
