package com.hooning.encapsulation.player;

public class EnhancedPlayer {

    private String name;
    private int hitPoint = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoint = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoint -= damage;

        if (this.hitPoint <= 0) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoint;
    }
}
