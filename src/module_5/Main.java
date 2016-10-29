package module_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        Controller cont = new Controller();
        ArrayList<Room> result = new ArrayList<>();
        result=cont.check(api1, api2);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println();
        result = cont.requstRooms(100, 2, null, null);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println();
        result = cont.check(api2, api3);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println();
        result = cont.check(api3, api1);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        System.out.println();
        result = api1.findRooms(500, 2, null, "Kiev");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        result = api2.getAll();
        System.out.println();
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
