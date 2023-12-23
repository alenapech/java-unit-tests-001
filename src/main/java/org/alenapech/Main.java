package org.alenapech;

import org.alenapech.calculator.Calculator;
import org.alenapech.calculator.DiscountAmountException;
import org.alenapech.calculator.PurchaseAmountException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.calculatingDiscount(100, 40));
        System.out.println(Calculator.calculatingDiscount(100.1, 1));
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);
        assertThat(Calculator.calculatingDiscount(100, 50)).isEqualTo(50);
        assertThat(Calculator.calculatingDiscount(100.1, 1)).isEqualTo(99.1);
        assertThat(Calculator.calculatingDiscount(100.15, 1)).isEqualTo(99.15);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-100, 1)).isInstanceOf(PurchaseAmountException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-0.99, -1)).isInstanceOf(PurchaseAmountException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -1)).isInstanceOf(DiscountAmountException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 101)).isInstanceOf(DiscountAmountException.class);
    }
}