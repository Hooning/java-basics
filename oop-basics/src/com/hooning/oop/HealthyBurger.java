package com.hooning.oop;

public class HealthyBurger extends Hamburger {
    private static final double HEALTHY_BURGER_PRICE = 6.75;
    private static final double MUSHROOM_PRICE = 0.45;
    private static final double BROCCOLI_PRICE = 0.40;

    private boolean mushroom;
    private boolean broccoli;

    public HealthyBurger(String meat) {
        super("Healty", "Brown Rye", meat, HEALTHY_BURGER_PRICE);
    }

    public void addMushroom() {
        this.mushroom = true;
        super.addToTotalPrice(super.getTotalPrice() + MUSHROOM_PRICE);
    }

    public void addBroccoli() {
        this.broccoli = true;
        super.addToTotalPrice(super.getTotalPrice() + BROCCOLI_PRICE);
    }
}
