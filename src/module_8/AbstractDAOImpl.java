package module_8;

import java.util.ArrayList;
import java.util.List;


public class AbstractDAOImpl implements AbstractDAO {
    ArrayList<User> dao = new ArrayList<User>();

    @Override
    public List save(List list) {
        dao.addAll(list);
        return list;
    }

    @Override
    public void delete(List list) {
        dao.remove(list);
    }

    @Override
    public void deleteAll(List list) {
        dao.removeAll(list);
    }

    @Override
    public void saveAll(List list) {
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
