package module_5;

import java.util.Arrays;

public class Controller {
    private API[] apis = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        Room[] room1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] room2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] room3 = apis[2].findRooms(price, persons, city, hotel);
        count = room1.length + room2.length + room3.length;
        Room[] rooms = new Room[count];
        int i = 0;
        for (int room1i = 0; room1i < room1.length; room1i++) {
            rooms[i] = room1[room1i];
            i++;
        }
        for (int room2i = 0; room2i < room2.length; room2i++) {
            rooms[i] = room2[room2i];
            i++;
        }
        for (int room3i = 0; room3i < room3.length; room3i++) {
            rooms[i] = room3[room3i];
            i++;
        }
        return rooms;
    }


    public Room[] check(API  api1, API api2) {
        int count = 5;
        int q=0;
        Room[] rooms1 = api1.getAll();
        Room[] rooms2 = api2.getAll();
        Room[] res = new Room[count];
        for (int i=0; i<rooms1.length; i++) {
            for (int ii = 0; ii < rooms2.length; ii++) {
                if (rooms1[i].equals(rooms2[ii])) {
                    res[q]=rooms1[i];
                    q++;
                }
            }
        }
        return res;
    }
}
