package com.company;

public class RomanConverter {
    public String convert(int num) {
        if (num > 0 && num <= 10) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 1) {
                    return n.getRomanNum();
                }
            }
        }
        if (num > 10 && num <= 20) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 11) {
                    return "X" + n.getRomanNum();
                }
            }
        }
        if (num > 20 && num <= 30) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 21) {
                    return "XX" + n.getRomanNum();
                }
            }
        }
        if (num > 30 && num < 40) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 31) {
                    return "XXX" + n.getRomanNum();
                }
            }
        }
        if (num == 40) { return "XL"; }
        if (num > 40 && num < 50) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 41) {
                    return "XL" + n.getRomanNum();
                }
            }
        }
        if (num == 50) { return "L"; }
        if (num > 50 && num <= 60) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 51) {
                    return "L" + n.getRomanNum();
                }
            }
        }
        if (num > 60 && num <= 70) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 61) {
                    return "LX" + n.getRomanNum();
                }
            }
        }
        if (num > 70 && num <= 80) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 71) {
                    return "LXX" + n.getRomanNum();
                }
            }
        }
        if (num > 80 && num < 90) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 81) {
                    return "LXXX" + n.getRomanNum();
                }
            }
        }
        if (num == 90) { return "XC"; }
        if (num > 90 && num < 100) {
            for (Number n : Number.values()) {
                if (n.ordinal() == num - 91) {
                    return "XC" + n.getRomanNum();
                }
            }
        }
        if (num == 100) { return "C"; }
        return "N";
    }
}
