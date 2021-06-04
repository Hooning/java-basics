package com.hooning.encapsulation.printer;

public class Printer {
    private int tonerLevel = 100;
    private int printedPages;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.printedPages = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        double pagesToPrint = pages;
        if (this.duplex) {
            // 3 => 2, 4 => 2, 1 => 1
            pagesToPrint = (int) Math.ceil(pagesToPrint / 2);
            System.out.println("Printing in duplex mode");
        }

        this.printedPages += pagesToPrint;
        return (int) pagesToPrint;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
