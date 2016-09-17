package module_5;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date somedate = new Date();
        API api1 = new GoogleAPI();
        API api2 = new TripAdvisorAPI();
        DAO sav = new DAOImpl();
        Room room = new Room(123, 100, 2, somedate, "Evropa", "Lvov");
        Room room1 = new Room(1223, 100, 2, somedate, "Evropa", "Lvov");
       Controller cont = new Controller();
        cont.requstRooms(100, 2, "Evropa", "Lvov");

        api1.findRooms(100, 2, "Evropa", "Lvov");
        sav.save(room);
        System.out.println(cont.check(api1, api2));
    }
}
