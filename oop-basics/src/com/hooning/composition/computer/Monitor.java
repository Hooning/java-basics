package com.hooning.composition.computer;

public class Monitor {
    private String model;
    private String manufacturere;
    private int size;
    private Resolution nativeResolution; // Resolution is a composition

    public Monitor(String model, String manufacturere, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturere = manufacturere;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color: " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturere() {
        return manufacturere;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
