package com.hooning.encapsulation.printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPrintedPages());

        int pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPrintedPages());

        pagesPrinted = printer.printPages(11);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPrintedPages());
    }

}
