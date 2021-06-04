package com.hooning.encapsulation.player;

public class AfterEncapsulation {

    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("David", 200, "Bow");

        System.out.println("Initial health is " + player.getHealth());
    }

}
