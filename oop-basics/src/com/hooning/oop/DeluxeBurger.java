package com.hooning.oop;

public class DeluxeBurger extends Hamburger {
    private static final double DELUXE_BURGER_PRICE = 10.25;

    private boolean chips;
    private boolean drinks;

    public DeluxeBurger(String meat) {
        super("Deluxe", "Wheat Bread", meat, DELUXE_BURGER_PRICE);
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void addLettuce() {
        System.out.println("Add lettuce not possible");
    }

    @Override
    public void addTomato() {
        System.out.println("Add tomato not possible");
    }

    @Override
    public void addCarrot() {
        System.out.println("Add carrot not possible");
    }

    @Override
    public void addOnion() {
        System.out.println("Add onion not possible");
    }
}
