package module_7;


import java.util.Comparator;

public class SortPriceCity implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        int res = Integer.compare(o1.getPrice(),  o2.getPrice());
        if (res == 0) {
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        }
        return res;
    }
}
