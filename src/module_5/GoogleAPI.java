package module_5;


import java.util.Date;

public class GoogleAPI implements API {
    Room[] rooms = new Room[5];

    public GoogleAPI() {
        Date someDate = new Date();
        Room room1 = new Room(31, 525, 2, someDate, "MIRGOROD", "Lviv");
        rooms[0] = room1;
        Room room2 = new Room(32, 450, 2, someDate, "MIRGOROD", "Lviv");
        rooms[1] = room2;
        Room room3 = new Room(33, 350, 1, someDate, "MIRGOROD", "Lviv");
        rooms[2] = room3;
        Room room4 = new Room(34, 300, 1, someDate, "MIRGOROD", "Lviv");
        rooms[3] = room4;
        Room room5 = new Room(35, 700, 4, someDate, "MIRGOROD", "Lviv");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return rooms;
    }
}