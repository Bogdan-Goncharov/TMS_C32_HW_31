package strategy.model;

import strategy.util.DiscountStrategy;

public class LoyaltyDiscount implements DiscountStrategy {
    private double loyaltyDiscount;

    public LoyaltyDiscount(double loyaltyDiscount) {
        this.loyaltyDiscount = loyaltyDiscount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - loyaltyDiscount;
    }
}
