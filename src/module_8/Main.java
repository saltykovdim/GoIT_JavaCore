package module_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User(12, "first");
        ArrayList<User> list = new ArrayList<>();
        UserDAO dao = new UserDAO(list);
        dao.save(user);
        System.out.println(dao.getList());
    }
}
