package module_7;

import java.util.*;

public class Main {
    public static List<Order> separateUniqueCity(List<Order> list) {
        List<Order> result = new ArrayList<>();
        int q = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i).getUser().getCity().equals(list.get(q).getUser().getCity()))) {
                result.add(list.get(i));
                q++;
            }
        }
        return result;
    }

    public static List<Order> delItemPriceLess(List<Order> list) {
        List<Order> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 1500) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static List<Order> sepUAH(List<Order> list) {
        List<Order> resultUAH = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrency().equals(Currency.UAH)) {
                resultUAH.add(list.get(i));
            }
        }
        return resultUAH;
    }

    public static List<Order> sepUSD(List<Order> list) {
        List<Order> resultUSD = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrency().equals(Currency.USD)) {
                resultUSD.add(list.get(i));
            }
        }
        return resultUSD;
    }

    public static boolean checkUserLastName(Set<Order> list, String name) {
        Iterator<Order> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getUser().getLastName().equals(name)) {
                return true;
            }
        }
        return false;
    }

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

        listOrders.sort(Comparator.naturalOrder());
        System.out.println();
        listOrders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = Integer.compare(o1.getPrice(), o2.getPrice());
                if (res == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return res;
            }
        });
        System.out.println(listOrders);
        listOrders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int res = o1.getItemName().compareTo(o2.getItemName());
                if (res == 0) {
                    res = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if (res == 0) {
                        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                }
                return res;
            }
        });
        System.out.println(listOrders);
        System.out.println(sepUAH(listOrders));
        System.out.println();
        System.out.println(sepUSD(listOrders));
        System.out.println();
        System.out.println(delItemPriceLess(listOrders));
        System.out.println();
        System.out.println(separateUniqueCity(listOrders));
        System.out.println();

        // Set list = new HashSet(listOrders);
        //System.out.println(list);
        Set<Order> orderSet = new TreeSet<>();
        User user11 = new User(1, "first", "Petrov", "Petrov", 100);
        orderSet.add(new Order(1, 5, Currency.USD, "pencil", "Active", user11));
        User user12 = new User(2, "first", "first", "kiev", 100);
        orderSet.add(new Order(2, 50, Currency.USD, "pencil", "Active", user12));
        User user13 = new User(3, "firstt", "firstt", "Doneck", 100);
        orderSet.add(new Order(3, 500, Currency.USD, "pencils", "Active", user13));
        User user14 = new User(4, "two", "two", "lviv", 100);
        orderSet.add(new Order(4, 600, Currency.USD, "pen", "Active", user14));
        User user15 = new User(5, "twof", "twof", "odessa", 100);
        orderSet.add(new Order(5, 60, Currency.UAH, "pen", "Active", user15));
        User user16 = new User(6, "ttwof", "ttwof", "kiev", 100);
        orderSet.add(new Order(6, 6, Currency.USD, "pen", "Active", user16));
        User user17 = new User(7, "twof", "twof", "odessa", 100);
        orderSet.add(new Order(7, 70000000, Currency.USD, "pen", "Active", user17));
        User user18 = new User(8, "twoft", "twoft", "odessa", 100);
        orderSet.add(new Order(8, 70, Currency.USD, "box", "Active", user18));
        User user19 = new User(9, "twof", "twof", "bahmut", 100);
        orderSet.add(new Order(9, 7000, Currency.USD, "box+pen", "Active", user19));
        User user20 = new User(10, "twof", "twof", "odessa", 100);
        orderSet.add(new Order(10, 800, Currency.USD, "box+pen", "Active", user20));

        //System.out.println(checkUserLastName(orderSet, "Petrov"));
        
        System.out.println();

        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(Currency.UAH)) {
                iterator.remove();
            }
        }
        System.out.println(orderSet);


    }


}
