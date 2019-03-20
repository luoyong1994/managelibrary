package com.ly.mobilelibrary.base.mapper;

import com.ly.mobilelibrary.base.model.Borrow;
import com.ly.mobilelibrary.base.util.JsonResult;

import java.util.List;

public interface ManageBorrowInfoMapper {
    //图书借阅
    public void addBorrowInfo(Borrow borrow);

    public void updateBorrowInfo(Borrow borrow);

    public List<Borrow> queryBorrowInfo(Borrow borrow);
}
