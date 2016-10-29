package module_5;


import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {
    ArrayList<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        Date someDate = new Date();
        Room room1 = new Room(21, 500, 2, someDate, "Sputnic", "Dnepr");
        rooms.add(room1);
        Room room2 = new Room(22, 500, 2, someDate, "MIRGOROD", "Lviv");
        rooms.add(room2);
        Room room3 = new Room(23, 500, 2, someDate, "Inturist", "Kiev");
        rooms.add(room3);
        Room room4 = new Room(24, 500, 2, someDate, "Sputnic", "Dnepr");
        rooms.add(room4);
        Room room5 = new Room(25, 5000, 4, someDate, "Sputnic", "Dnepr");
        rooms.add(room5);
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

    @Override
    public ArrayList<Room> getAll() {
        return rooms;
    }
}
