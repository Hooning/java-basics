package com.hooning.composition.house;

import java.util.List;

public class House {
    private String address;
    private int story;
    private double size;
    private List<Room> rooms;

    public House(String address, int story, double size, List<Room> rooms) {
        this.address = address;
        this.story = story;
        this.size = size;
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public int getStory() {
        return story;
    }

    public double getSize() {
        return size;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
