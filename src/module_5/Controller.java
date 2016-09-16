package module_5;


public class Controller {
    private API[] apis = new API[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] room1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] room2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] room3 = apis[2].findRooms(price, persons, city, hotel);

        int count = 0;
        Room[] rooms = new Room[count];
        if (room1.length > 0) {
            for (int i = 0; i < room1.length; i++) {

                count++;
            }
        }
        if (room2.length > 0) {
            for (int i = 0; i < room2.length; i++) {
                rooms[count] = room1[i];
                count++;
            }
        }
        if (room3.length > 0) {
            for (int i = 0; i < room3.length; i++) {
                rooms[count] = room1[i];
                count++;
            }
        }
        return rooms;
    }
}
