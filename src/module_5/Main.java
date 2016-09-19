package module_5;

public class Main {
    public static void main(String[] args) {
        API api1 = new BookingComAPI();
        API api2 = new TripAdvisorAPI();
        API api3 = new GoogleAPI();
        Controller cont = new Controller();
        Room[] result = cont.check(api1, api2);
        for (int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        cont.check(api2, api3);

    }
}
