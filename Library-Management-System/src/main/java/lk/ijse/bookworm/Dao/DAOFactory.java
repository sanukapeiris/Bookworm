package lk.ijse.bookworm.Dao;

import lk.ijse.bookworm.Dao.Custom.impl.*;

public class DAOFactory {
    public static DAOFactory daoFactory;

    public DAOFactory() {

    }

    public static DAOFactory getDaoFactory(){
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DTOTypes{
        ADMIN,BOOK,BORROW,BRANCH,QUERY,USER
    }

    public SuperDAO getDAO(DTOTypes dtoTypes){
        switch (dtoTypes){
            case ADMIN: return new AdminDaoImpl();
            case BOOK: return new BookDaoImpl();
            case BORROW: return new BorrowDaOImpl();
            case BRANCH: return new BranchDaoImpl();
            case QUERY: return new QueryDaoImpl();
            case USER:return new UserDaoImpl();

        }
        return null;
    }
}
