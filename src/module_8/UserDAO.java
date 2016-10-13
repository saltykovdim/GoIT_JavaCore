package module_8;


import java.util.ArrayList;

public class UserDAO<User> extends AbstractDAOImpl<User>{
    ArrayList<User> dao = new ArrayList<>();

    public UserDAO(ArrayList<User> dao) {
        this.dao = dao;
    }

    User save(User user) {
        dao.add(user);
        return user;
    }
}
