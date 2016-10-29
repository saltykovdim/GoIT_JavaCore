package module_8;

import java.util.ArrayList;
import java.util.List;


public class AbstractDAOImpl<User> implements AbstractDAO<User> {
    ArrayList<User> dao = new ArrayList<User>();

    @Override
    public List save(List<User> list) {
        dao.addAll(list);
        return list;
    }

    @Override
    public void delete(List<User> list) {
        dao.remove(list);
    }

    @Override
    public void deleteAll(List<User> list) {
        dao.removeAll(list);
    }

    @Override
    public void saveAll(List<User> list) {
        dao.addAll(list);
    }

    @Override
    public List getList() {
        return dao;
    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < dao.size(); i++)
            if (dao.get(i).equals(id)) {
                dao.remove(i);
            }
    }

    @Override
    public List get(long id) {
        ArrayList<User> result = new ArrayList<>();
        for (int i = 0; i < dao.size(); i++)
            if (dao.get(i).equals(id)) {
                result.add(dao.get(i));
            }
        return result;
    }
}
