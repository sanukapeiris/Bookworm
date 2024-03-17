package lk.ijse.bookworm.Bo.Custom.impl;

import lk.ijse.bookworm.Bo.Custom.BorrowBo;
import lk.ijse.bookworm.Dao.Custom.BorrowDao;
import lk.ijse.bookworm.Dao.Custom.impl.BorrowDaOImpl;
import lk.ijse.bookworm.Dao.DAOFactory;

public class BorrowBoImpl implements BorrowBo {


    BorrowDao borrowDaO = (BorrowDao) DAOFactory.getDaoFactory().getDAO(DAOFactory.DTOTypes.BORROW);
    @Override
    public String generateNextOrderDetailId() throws Exception {
        return borrowDaO.generateNextValue2();
    }
    @Override
    public String genarateNextBorrowId() throws Exception {
        return borrowDaO.generateNextId();
    }
}
