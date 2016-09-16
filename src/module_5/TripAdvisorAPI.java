package module_5;


import java.util.Date;

public class TripAdvisorAPI implements API {
    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Date someDate = new Date();
        Room room1 = new Room(21, 625, 2, someDate, "Sputnic", "Dnepr");
        rooms[0] = room1;
        Room room2 = new Room(22, 550, 2, someDate, "Sputnic", "Dnepr");
        rooms[1] = room2;
        Room room3 = new Room(23, 650, 1, someDate, "Sputnic", "Dnepr");
        rooms[2] = room3;
        Room room4 = new Room(24, 500, 1, someDate, "Sputnic", "Dnepr");
        rooms[3] = room4;
        Room room5 = new Room(25, 800, 4, someDate, "Sputnic", "Dnepr");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return rooms;
    }
}