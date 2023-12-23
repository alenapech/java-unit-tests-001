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


    // 1.7
    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()             // Массив не должен быть пустым
                .hasSize(7)      // Размер массива должен быть равен 7
                .doesNotHaveDuplicates() // Массив не должен содержать повторяющихся элементов
                .contains("orange", "green", "violet") // Массив должен содержать цвета: "orange", "green", "violet"
                .endsWith("gold")   //  Последним цветом в массиве должен быть "gold"
                .startsWith("aqua")     // Первым цветом в массиве должен быть "aqua"
                .containsSequence("yellow", "blue")      // В массиве должна быть последовательность цветов "yellow", "blue"
                .doesNotContain("red", "black"); //Массив не должен содержать цвета: "red", "black"
    }
}