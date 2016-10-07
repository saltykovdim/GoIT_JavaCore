package module_7;

import java.util.ArrayList;
import java.util.List;

public class DelItemPriceLess {
    public List<Order> delPrice(List<Order> list) {
        List<Order> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 1500) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}

