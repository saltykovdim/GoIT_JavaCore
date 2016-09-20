package module_5;

public class Main {
    public static void main(String[] args) {
        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        Controller cont = new Controller();
        Room[] result = cont.check(api1, api2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
        result = cont.requstRooms(100, 2, null, null);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
        result = cont.check(api2, api3);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
        result = cont.check(api3, api1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
        result=api1.findRooms(500, 2 , null, "Kiev");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        result=api2.getAll();
        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
