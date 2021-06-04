package com.hooning.encapsulation.player;

public class BeforeEncapsulation {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Hoon";
        // can forget to assign certain fields
        player.health = 40;
        player.weapon = "Bow and Arrows";

        int damage = 15;

        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 30;
        // prevent unwanted changes that is hard to control
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }

}
