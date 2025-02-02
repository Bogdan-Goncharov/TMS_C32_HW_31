package strategy;

import strategy.model.FixedDiscount;
import strategy.model.LoyaltyDiscount;
import strategy.model.PercentageDiscount;
import strategy.model.PriceCalculator;

public class ApplicationRunner {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();

        calculator.setDiscountStrategy(new FixedDiscount(10));
        System.out.println("Price after fixed discount: " + calculator.calculatePrice(100));

        calculator.setDiscountStrategy(new PercentageDiscount(15));
        System.out.println("Price after percentage discount: " + calculator.calculatePrice(100));

        calculator.setDiscountStrategy(new LoyaltyDiscount(20));
        System.out.println("Price after loyalty discount: " + calculator.calculatePrice(100));
    }
}
