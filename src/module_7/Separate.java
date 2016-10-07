package module_7;

import java.util.ArrayList;
import java.util.List;

public class Separate {
    public List<Order> sepUAH(List<Order> list) {
        List<Order> resultUAH = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrency().equals(Currency.UAH)) {
                resultUAH.add(list.get(i));
            }
        }
        return resultUAH;
    }
    public List<Order> sepUSD(List<Order> list) {
        List<Order> resultUSD = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrency().equals(Currency.USD)) {
                resultUSD.add(list.get(i));
            }
        }
        return resultUSD;
    }
}
