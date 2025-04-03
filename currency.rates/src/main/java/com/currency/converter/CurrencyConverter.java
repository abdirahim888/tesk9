package com.currency.converter;
import  com.currency.rates.ExchangeRateProvider;
public class CurrencyConverter {
    public static double convert(String from, String to, double amount) {
        double rate = ExchangeRateProvider.getRate(from, to);
        return amount * rate;
    }
}
