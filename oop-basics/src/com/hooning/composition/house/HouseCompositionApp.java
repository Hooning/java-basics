package com.hooning.composition.house;

import java.util.List;

public class HouseCompositionApp {

    public static void main(String[] args) {
        Room room1 = new Room("Living", 3, 2, new RoomDimension(200, 250, 70));
        Room room2 = new Room("Kinder", 1, 1, new RoomDimension(100, 150, 70));
        House house = new House("Bernsdorfer Str.102", 1, 49.44, List.of(room1, room2));

        house.getRooms().forEach(Room::printRoomDimension);
    }

}
