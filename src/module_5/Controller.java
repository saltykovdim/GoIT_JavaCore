package module_5;

import java.util.ArrayList;

public class Controller {
    private ArrayList<API> apis = new ArrayList<API>();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public ArrayList<Room> requstRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        ArrayList<Room> room1 = apis.get(0).findRooms(price, persons, city, hotel);
        ArrayList<Room> room2 = apis.get(1).findRooms(price, persons, city, hotel);
        ArrayList<Room> room3 = apis.get(2).findRooms(price, persons, city, hotel);
        ArrayList<Room> rooms = new ArrayList<>();
        for (int room1i = 0; room1i < room1.size(); room1i++) {
            rooms.add(room1.get(room1i));
        }
        for (int room2i = 0; room2i < room2.size(); room2i++) {
            rooms.add(room2.get(room2i));
        }
        for (int room3i = 0; room3i < room3.size(); room3i++) {
            rooms.add(room3.get(room3i));
        }
        return rooms;
    }


    public ArrayList<Room> check(API api1, API api2) {
        ArrayList<Room> rooms1 = api1.getAll();
        ArrayList<Room> rooms2 = api2.getAll();
        ArrayList<Room> res = new ArrayList<>();
        for (int i = 0; i < rooms1.size(); i++) {
            for (int ii = 0; ii < rooms2.size(); ii++) {
                if (rooms1.get(i).equals(rooms2.get(ii))) {
                    res.add(rooms1.get(i));
                }
            }
        }
        return res;
    }
}
