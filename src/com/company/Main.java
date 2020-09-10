package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Input a expression:");
        String expression = in.nextLine();
        String[] items = expression.split(" ");
        String numberA = items[0];
        String numberB = items[2];
        String operator = items[1];
        boolean isRomanExpression = isRoman(numberA) && isRoman(numberB);
        boolean isArabicExpression = isArabic(numberA) && isArabic(numberB);
        Number a = parseNumber(numberA);
        Number b = parseNumber(numberB);
        if (!(isRomanExpression || isArabicExpression)) {
            throw new Exception("Incorrect expression format.");
        }
        final int intA = Integer.parseInt(a.getArabicNum());
        final int intB = Integer.parseInt(b.getArabicNum());
        final int result = calculator.calculate(intA, intB, operator);
        if (isRomanExpression) {
            RomanConverter rc = new RomanConverter();
            System.out.printf("Result is %s", rc.convert(result));
        } else {
            System.out.printf("Result is %d", result);
        }
    }
    private static Number parseNumber(String num) throws Exception {
        for (Number n : Number.values()) {
            if (num.equals(n.getRomanNum()) || num.equals(n.getArabicNum())) {
                return n;
            }
        }
        throw new Exception("This number is not in the range from 1 to 10");
    }
    private static boolean isRoman(String n) {
        for (Number num : Number.values()) {
            if (n.equals(num.getRomanNum())) {
                return true;
            }
        }
        return false;
    }
    private static boolean isArabic(String n) {
        for (Number num : Number.values()) {
            if (n.equals(num.getArabicNum())) {
                return true;
            }
        }
        return false;
    }
}
