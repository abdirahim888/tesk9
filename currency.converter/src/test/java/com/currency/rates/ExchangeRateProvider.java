// currency.rates/src/com/currency/rates/ExchangeRateProvider.java
package com.currency.rates;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRateProvider {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD_EUR", 0.85);
        exchangeRates.put("EUR_USD", 1.18);
        exchangeRates.put("USD_GBP", 0.75);
        exchangeRates.put("GBP_USD", 1.33);
    }

    public static double getRate(String from, String to) {
        return exchangeRates.getOrDefault(from + "_" + to, 1.0);
    }
}
