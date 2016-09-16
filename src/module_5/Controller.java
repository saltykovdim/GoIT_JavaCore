package module_5;


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
        count=room1.length + room2.length + room3.length;
        Room[] rooms = new Room[count];
        for(int i=0; i<rooms.length;i++){
            for (int room1i = 0; i < room1.length; i++) {
                rooms[i]=room1[room1i];
            }
            for (int room2i = 0; i < room2.length; i++) {
                rooms[i]=room2[room2i];
            }
            for (int room3i = 0; i < room3.length; i++) {
                rooms[i]=room3[room3i];
            }
        }
       return rooms;
    }


    public Room[] check(API api1, API api2) {

        return null;
    }
}
