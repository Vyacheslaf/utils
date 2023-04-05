package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource(value = {"1",
                        "0.1",
                        "010",
                        "0x7fffffffffffffff",
                        "0X7FFFFFFFFFFFFFFFFF",
                        "1e-1",
                        "4.9E-3240",
                        "1l",
                        "1L"})
    void isPositiveNumberReturnsTrue(String str) {
        assertTrue(StringUtils.isPositiveNumber(str), "method isPositiveNumber should return 'true'");
    }

    @ParameterizedTest
    @CsvSource(value = {"NULL",
                        "''",
                        "0,1",
                        "019",
                        "0xG",
                        "-1",
                        "-92233720368547758080",
                        "0"},
                nullValues = {"NULL"})
    void isPositiveNumberReturnsFalse(String str) {
        assertFalse(StringUtils.isPositiveNumber(str), "method isPositiveNumber should return 'false'");
    }
}
