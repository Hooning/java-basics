package com.hooning.oop;

import java.math.BigDecimal;

public class Hamburger {

    private static final double LETTUCE_PRICE = 0.15;
    private static final double TOMATO_PRICE = 0.30;
    private static final double CARROT_PRICE = 0.10;
    private static final double ONION_PRICE = 0.25;

    private String name;
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;
    private double basePrice;
    private double totalPrice;

    public Hamburger(String name, String breadRollType,
                     String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = price;
        this.totalPrice = price;
    }

    public void addLettuce() {
        this.lettuce = true;
        this.totalPrice += LETTUCE_PRICE;
    }

    public void addTomato() {
        this.tomato = true;
        this.totalPrice += TOMATO_PRICE;
    }

    public void addCarrot() {
        this.carrot = true;
        this.totalPrice += CARROT_PRICE;
    }

    public void addOnion() {
        this.onion = true;
        this.totalPrice += ONION_PRICE;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addToTotalPrice(double price) {
        this.totalPrice += price;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

}
