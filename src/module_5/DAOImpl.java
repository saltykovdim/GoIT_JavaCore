package module_5;

import java.util.Date;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("save " + room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("your room " + room + " delete");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("your room " + room + " update");
        return room;
    }

    @Override
    public Room findById(long id) {
        Date someDate = new Date();
        Room room = new Room(id, 0, 0, someDate, null, null);
        System.out.println("your room with " + id + " found");
        return room;
    }
}
