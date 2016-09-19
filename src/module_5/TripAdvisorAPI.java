package module_5;


import java.util.Date;

public class TripAdvisorAPI implements API {
    Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        Date someDate = new Date();
        Room room1 = new Room(21,500, 2, someDate, "Sputnic", "Dnepr");
        rooms[0] = room1;
        Room room2 = new Room(22, 500, 2, someDate, "MIRGOROD", "Lviv");
        rooms[1] = room2;
        Room room3 = new Room(23, 500, 2, someDate, "Inturist", "Kiev");
        rooms[2] = room3;
        Room room4 = new Room(24, 500, 2, someDate, "Sputnic", "Dnepr");
        rooms[3] = room4;
        Room room5 = new Room(25, 5000, 4, someDate, "Sputnic", "Dnepr");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room find = new Room(0, price, persons, new Date(), city, hotel);
        int count = 0;
        int i = 0;
        for (int ii = 0; ii < rooms.length; ii++) {
            if (find.equals(rooms[ii])) {
                count++;
            }
        }
        Room[] result = new Room[count];
        for (int ii = 0; ii < rooms.length; ii++) {
            if (find.equals(rooms[ii])) {
                result[i] = rooms[ii];
                i++;
            }
        }
        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
