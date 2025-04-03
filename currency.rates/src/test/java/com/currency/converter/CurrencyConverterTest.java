package com.currency.converter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CurrencyConverterTest {
    @BeforeEach
    void setUp() {
    }
    @Test
    void convert() { double result = CurrencyConverter.convert("USD", "INR", 100);
        assertEquals(100.0, result, 0.01);
    }
}