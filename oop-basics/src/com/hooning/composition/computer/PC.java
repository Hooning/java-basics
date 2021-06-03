package com.hooning.composition.computer;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Mac OS Catalina");
    }

    private void drawLogo() {
        // fancy graphics
        monitor.drawPixelAt(1200, 50, "green");
    }
}
