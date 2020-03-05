package com.ex2_3;

import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new ClassDouble();

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.add(null, 3d));
        System.out.println(calculator.add(Double.POSITIVE_INFINITY, 3d));
        System.out.println(calculator.add(Double.NEGATIVE_INFINITY, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.divide(9d, null));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        // TODO: Test edge cases that would throw exceptions
    }
}
