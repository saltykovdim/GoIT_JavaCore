package module_5;

public class Main {
    public static void main(String[] args) {
        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        Controller cont = new Controller();
        cont.check(api1, api2);
        cont.check(api2, api3);

    }
}
