package main_package;
import com.currency.converter.CurrencyConverter;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the source currency (e.g., USD): ");
        String fromCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the target currency (e.g., EUR): ");
        String toCurrency = scanner.nextLine().toUpperCase();
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = CurrencyConverter.convert(fromCurrency, toCurrency, amount);
        System.out.printf("%f %s is equal to %f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        scanner.close();
    }
}

