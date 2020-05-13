package com.epam.ld.javabasics30.unit08.skils.formation.task02;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String asString() {
        return String.format("%s%d/%d", Integer.signum(this.numerator)*Integer.signum(this.denominator)<0?"-":"", Math.abs(this.numerator), Math.abs(this.denominator));
    }
}
