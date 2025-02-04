package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DNICalculationTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "52694436, X",
            "28771125, B",
            "47913848, H",
            "30332192, E",
            "18345084, P",
            "89012345, E",
            "24462905, J",
            "30609502, K",
            "56838824, M"
    })

    void calculateLetterTest(int dni, char expectedLetter) {
        char letter = DNICalculation.calculateLetter(dni);
        assertEquals(expectedLetter, letter);

    }
}