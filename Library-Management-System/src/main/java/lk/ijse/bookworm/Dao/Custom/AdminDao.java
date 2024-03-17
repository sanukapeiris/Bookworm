package lk.ijse.bookworm.Dao.Custom;

import lk.ijse.bookworm.Entity.Admin;

public interface AdminDao extends CrudDao<Admin> {
//    boolean save(Admin admin)throws Exception;
//
//    List getAll()throws Exception;
//
    boolean check(Admin admin)throws Exception;
//
//
//    String generateNextId()throws Exception;

}
