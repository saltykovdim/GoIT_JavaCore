package module_5;

import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {
    ArrayList<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        Date someDate = new Date();
        Room room1 = new Room(11, 500, 2, someDate, "Inturist", "Kiev");
        rooms.add(room1);
        Room room2 = new Room(12, 500, 2, someDate, "MIRGOROD", "Lviv");
        rooms.add(room2);
        Room room3 = new Room(13, 250, 1, someDate, "Inturist", "Kiev");
        rooms.add(room3);
        Room room4 = new Room(14, 500, 2, someDate, "Inturist", "Kiev");
        rooms.add(room4);
        Room room5 = new Room(15, 500, 2, someDate, "Sputnic", "Dnepr");
        rooms.add(room5);
    }

    @Override
    public ArrayList<Room> getAll() {
        return rooms;
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        Room find = new Room(0, price, persons, new Date(), city, hotel);
        ArrayList<Room> result = new ArrayList<>();
        for (int ii = 0; ii < rooms.size(); ii++) {
            if (find.equals(rooms.get(ii))) {
                result.add(rooms.get(ii));
            }
        }
        return result;
    }
}
