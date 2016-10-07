package module_7;

import java.util.Comparator;

public class SortItemNameShopCity implements Comparator<Order>{
    @Override
    public int compare(Order o1, Order o2) {
    int res = o1.getItemName().compareTo(o2.getItemName());
        if (res == 0){
            res = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if(res == 0){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        }
        return res;
    }
}
