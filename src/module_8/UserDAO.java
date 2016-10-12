package module_8;


public class UserDAO extends AbstractDAOImpl{
    public UserDAO() {
    }
    User save(User user) {
        save(user);
        return user;
    }
}
