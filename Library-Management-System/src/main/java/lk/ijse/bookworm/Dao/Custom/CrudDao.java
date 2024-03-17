package lk.ijse.bookworm.Dao.Custom;

import lk.ijse.bookworm.Dao.SuperDAO;
import lk.ijse.bookworm.Entity.Book;

import java.util.List;

public interface CrudDao <T> extends SuperDAO {
    String generateNextId()throws Exception;

    List<T> getAll()throws Exception;

    boolean save(T book)throws Exception;

    boolean delete(T book)throws Exception;

    boolean update(T book)throws Exception;

    T search(String id)throws Exception;
}
