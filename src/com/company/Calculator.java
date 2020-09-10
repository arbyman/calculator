package com.company;

public class Calculator {
    public int calculate(final int a, final int b, String operator) {
        return getOperator(operator).calc(a, b);
    }
    private Operation getOperator(String operator) {
        return switch (operator) {
            case "+":
                yield Operation.SUM;
            case "-":
                yield Operation.SUBTRACT;
            case "*":
                yield Operation.MULTIPLY;
            case "/":
                yield Operation.DIVIDE;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}
