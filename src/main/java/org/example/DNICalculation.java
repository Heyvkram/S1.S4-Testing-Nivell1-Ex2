package org.example;

public class DNICalculation {

    private static final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetter(int dniNumber) {

        int resto = dniNumber % 23;

        return LETTERS.charAt(resto);
    }
}
