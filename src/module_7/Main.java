package module_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List<User> listUsers = new ArrayList();
        List<Order> listOrders = new ArrayList();
        listUsers.add(new User(1, "first", "first", "kiev", 100));
        listOrders.add(new Order(1, 50, Currency.UAH, "pen", "Active",listUsers.get(0)));
        listUsers.add(new User(2, "first", "second", "kiev", 1000));
        listOrders.add(new Order(2, 50, Currency.UAH, "pencil", "Active", listUsers.get(1)));
        listUsers.add(new User(1, "first", "first", "odessa", 100));
        listOrders.add(new Order(1, 50, Currency.UAH, "pen", "Active", listUsers.get(2)));
        listUsers.add(new User(4, "first", "four", "kiev", 10000));
        listOrders.add(new Order(4, 500, Currency.UAH, "ship", "Active", listUsers.get(3)));
        listUsers.add(new User(5, "fifth", "first", "dnepr", 10));
        listOrders.add(new Order(5, 50, Currency.USD, "paper", "Active", listUsers.get(4)));
        listUsers.add(new User(6, "first", "first", "kiev", 10000));
        listOrders.add(new Order(6, 10, Currency.UAH, "notebook", "Active",listUsers.get(5)));
        listUsers.add(new User(7, "first", "twelf", "lviv", 100));
        listOrders.add(new Order(7, 50, Currency.UAH, "pc", "Active",listUsers.get(6)));
        listUsers.add(new User(8, "first", "first", "kiev", 100));
        listOrders.add(new Order(8, 50, Currency.UAH, "pen", "Active",listUsers.get(7)));
        listUsers.add(new User(9, "first", "first", "kiev", 100));
        listOrders.add(new Order(9, 50, Currency.UAH, "pen", "Active", listUsers.get(8)));
        listUsers.add(new User(10, "first", "first", "kiev", 100));
        listOrders.add(new Order(10, 50, Currency.UAH, "pen", "Active",listUsers.get(9)));

        list.add(listUsers);
        list.add(listOrders);

    }
}
