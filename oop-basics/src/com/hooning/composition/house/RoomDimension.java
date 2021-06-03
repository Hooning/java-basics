package com.hooning.composition.house;

public class RoomDimension {
    private int width;
    private int length;
    private int height;

    public RoomDimension(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
