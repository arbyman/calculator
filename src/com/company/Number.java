package com.company;

public enum Number {
    ONE("1", "I"),
    TWO("2","II"),
    THREE("3", "III"),
    FOUR("4", "IV"),
    FIVE("5", "V"),
    SIX("6", "VI"),
    SEVEN("7", "VII"),
    EIGHT("8", "VIII"),
    NINE("9", "IX"),
    TEN("10", "X");
    private final String arabic;
    private final String roman;
    Number(String number, String romanNumber) {
        this.arabic = number;
        this.roman = romanNumber;
    }
    public String getRomanNum() {
        return roman;
    }
    public String getArabicNum() {
        return arabic;
    }
}
