package com.hooning.composition.house;

public class Room {
    private String roomType;
    private int windows;
    private int doors;
    private RoomDimension roomDimension;

    public Room(String roomType, int windows, int doors, RoomDimension roomDimension) {
        this.roomType = roomType;
        this.windows = windows;
        this.doors = doors;
        this.roomDimension = roomDimension;
    }

    public void printRoomDimension() {
        System.out.println("This room has width of " + roomDimension.getWidth() + ", length of " + roomDimension.getLength() + ", and height of " + roomDimension.getHeight());
    }

    public String getRoomType() {
        return roomType;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    private RoomDimension getRoomDimension() {
        return roomDimension;
    }
}
