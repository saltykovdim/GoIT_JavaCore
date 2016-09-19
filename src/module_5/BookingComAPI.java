package module_5;

import java.util.Date;

public class BookingComAPI implements API {
    Room[] rooms = new Room[5];

    public BookingComAPI() {
        Date someDate = new Date();
        Room room1 = new Room(11, 500, 2, someDate, "Inturist", "Kiev");
        rooms[0] = room1;
        Room room2 = new Room(12, 500, 2, someDate, "Inturist", "Kiev");
        rooms[1] = room2;
        Room room3 = new Room(13, 250, 1, someDate, "Inturist", "Kiev");
        rooms[2] = room3;
        Room room4 = new Room(14, 200, 1, someDate, "Inturist", "Kiev");
        rooms[3] = room4;
        Room room5 = new Room(15, 500, 4, someDate, "Inturist", "Kiev");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room find = new Room(11, price, persons, new Date(), city, hotel);
        int i = 0;
        Room[] result = new Room[rooms.length];
        for (int ii = 0; ii < rooms.length; ii++) {
            if (rooms[ii].equals(find)) {
                result[i] = rooms[ii];
                i++;
            }
        }
        return result;
    }
}
