package module_8;


import java.util.List;

public interface AbstractDAO<T> {
   public List<T> save(List<T> list);
    public void delete(List<T> list);
    public void deleteAll(List<T> list);
    public void saveAll(List<T> list);
    public List <T> getList();
}
