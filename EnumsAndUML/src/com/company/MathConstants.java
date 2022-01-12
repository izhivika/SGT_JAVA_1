package com.company;

public enum MathConstants {

    PI(3.14),
    AVOGADRO_CONSTANT(6.02);

    // Create properties to hold these values
    private final double number;

    // Constructor
    MathConstants(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}