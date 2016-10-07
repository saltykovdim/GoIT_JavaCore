package module_7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> listOrders = new ArrayList();
        User user1 = new User(1, "first", "first", "kiev", 100);
        listOrders.add(new Order(1, 500, Currency.UAH, "pencil", "Active", user1));
        User user2 = new User(2, "first", "second", "kievv", 1000);
        listOrders.add(new Order(2, 500, Currency.UAH, "pencil", "No Active", user2));
        User user3 = new User(1, "first", "first", "odessa", 100);
        listOrders.add(new Order(1, 500, Currency.UAH, "pencil", "No Active", user3));
        User user4 = new User(4, "first", "four", "kieeeeeeeeeeeev", 10000);
        listOrders.add(new Order(4, 500, Currency.UAH, "ship", "NO Active", user4));
        User user5 = new User(5, "fifth", "first", "dnepr", 10);
        listOrders.add(new Order(5, 50, Currency.USD, "paper", "Active", user5));
        User user6 = new User(6, "first", "first", "kiev", 10000);
        listOrders.add(new Order(6, 10, Currency.UAH, "notebook", "No Active", user6));
        User user7 = new User(7, "first", "twelf", "lviv", 100);
        listOrders.add(new Order(7, 50, Currency.UAH, "pc", "Active", user7));
        User user8 = new User(8, "first", "first", "kiev", 100);
        listOrders.add(new Order(8, 50, Currency.UAH, "pen", "Active", user8));
        User user9 = new User(9, "first", "first", "kiev", 100);
        listOrders.add(new Order(9, 50, Currency.UAH, "pen", "Active", user9));
        User user10 = new User(10, "first", "first", "kiev", 100);
        listOrders.add(new Order(10, 50, Currency.UAH, "pen", "Active", user10));
        // listOrders.getClass();
        //System.out.println(listOrders);
        //listOrders.sort(Comparator.naturalOrder());
        // System.out.println(listOrders);
        //listOrders.sort(new SortPriceCity());
        //System.out.println(listOrders);
        //  listOrders.sort(new SortItemNameShopCity());
        //  System.out.println(listOrders);
        DelItemPriceLess del = new DelItemPriceLess();
        List<Order> wed = del.delPrice(listOrders);
        System.out.println(wed);
        listOrders=(new SeparateUniqueCity().city(listOrders));
        System.out.println(listOrders);

        //  Set list = new HashSet(listOrders);
        // System.out.println(list);

    }


}
