package module_7;

import java.util.ArrayList;
import java.util.List;

public class SeparateUniqueCity {
    public List<Order> city(List<Order> list) {
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
}
