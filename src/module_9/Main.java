package module_9;

import module_7.Currency;
import module_7.Order;
import module_7.User;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> listOrders = new ArrayList();
        User user1 = new User(1, "first", "first", "kiev", 100);
        listOrders.add(new Order(1, 500, Currency.USD, "pencil", "Active", user1));
        User user2 = new User(2, "first", "Petrov", "kiev", 1000);
        listOrders.add(new Order(2, 500, Currency.UAH, "pencil", "No Active", user2));
        User user3 = new User(1, "first", "first", "kiev", 100);
        listOrders.add(new Order(1, 500, Currency.UAH, "pencil", "No Active", user3));
        User user4 = new User(4, "first", "four", "kiev", 10000);
        listOrders.add(new Order(4, 500, Currency.UAH, "ship", "NO Active", user4));
        User user5 = new User(5, "fifth", "first","kiev", 10);
        listOrders.add(new Order(5, 50, Currency.USD, "paper", "Active", user5));
        User user6 = new User(6, "first", "first", "kiev", 10000);
        listOrders.add(new Order(6, 10, Currency.UAH, "notebook", "No Active", user6));
        User user7 = new User(7, "first", "twelf", "kievvvv", 100);
        listOrders.add(new Order(7, 50, Currency.UAH, "pc", "Active", user7));
        User user8 = new User(8, "first", "first", "kiev", 100);
        listOrders.add(new Order(8, 2050, Currency.UAH, "pen", "Active", user8));
        User user9 = new User(9, "first", "first", "kiev", 100);
        listOrders.add(new Order(9, 50, Currency.UAH, "pen", "Active", user9));
        User user10 = new User(10, "first", "first", "kiev", 100);
        listOrders.add(new Order(10, 5000, Currency.USD, "pen", "Active", user10));

        // - sort list by Order price in decrease order
        System.out.println("sort list by price in decrease");
        Collections.sort(listOrders, (a, b) -> b.compareTo(a));
        System.out.println(listOrders);

        //- sort list by Order price in increase order AND User city
        System.out.println("sort list by prace in increase and user's city");
        Comparator comparator = (Comparator<Order>) (o1, o2) -> {
            int res = Integer.compare(o1.getPrice(), o2.getPrice());
            if (res == 0) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return res;
        };

        Collections.sort(listOrders, (comparator));
        System.out.println(listOrders);

        //sort list by Order itemName AND ShopIdentificator AND User city
        System.out.println("sort list by itemName and ShopIdentificator");
        Comparator comparator1 = (Comparator<Order>) (o1, o2) -> {
            int res = o1.getItemName().compareTo(o2.getItemName());
            if (res == 0) {
                res = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (res == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
            }
            return res;
        };
        Collections.sort(listOrders, comparator1);
        System.out.println(listOrders);

        //- delete duplicates from the list
        System.out.println("Delete duplicates");
        listOrders.stream()
                .distinct()
                .forEach(System.out::println);

        //- delete items where price less than 1500
        System.out.println("If price less than 1500");
        listOrders.stream()
                .filter(p -> p.getPrice() > 1500)
                .forEach(System.out::println);

        //- separate list for two list - orders in USD and UAH
        System.out.println("USD");
        List<Order> listUsdOdrer = (List<Order>) listOrders.stream()
                .filter(p -> p.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList());
        System.out.println(listUsdOdrer);
        System.out.println("UAH");
        List<Order> listUahOrder = listOrders.stream()
                .filter(p -> p.getCurrency().equals(Currency.UAH))
                .collect(Collectors.toList());
        System.out.println(listUahOrder);

        //- separate list for as many lists as many unique cities are in User
        System.out.println("unique cities in User");

        List<List<Order>> list =new ArrayList<>();
        list= separeteCityUser(listOrders);
        list.forEach(System.out::println);

        //- check if set contain Order where User’s lastName is - “Petrov”
        System.out.println("if lastName is Petrov");
        listOrders.stream()
                .filter(p -> p.getUser().getLastName().equals("Petrov"))
                .forEach(System.out::println);

        //- delete orders where currency is USD
        System.out.println("delete all orders where currency is USD");
        listOrders.stream()
                .filter(p -> !(p.getCurrency().equals(Currency.USD)))
                .forEach(System.out::println);
    }

    public static List<List<Order>> separeteCityUser(List<Order> listOrders) {
        Set<Order> set = new HashSet<>(listOrders);
        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return (List<Order>) set.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());
            }
        };
        return listOrders.stream()
                .map(f)
                .collect(Collectors.toList());
    }
}
