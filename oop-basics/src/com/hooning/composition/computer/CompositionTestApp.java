package com.hooning.composition.computer;

public class CompositionTestApp {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 inch IPS HD Monitor", "Samsung", 27, new Resolution(2540, 1440));
        MotherBoard theMotherBoard = new MotherBoard("BH-450", "Gigabyte", 4, 6, "v2.52");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        thePC.powerUp();
//        thePC.getTheCase().pressPowerButton();
//        thePC.getMonitor().drawPixelAt(2,4,"blue");
//        thePC.getMotherBoard().loadProgram("Windows 10 64bit");
    }

}
