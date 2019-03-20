package com.ly.mobilelibrary.modual.book.service;

import com.ly.mobilelibrary.base.model.Borrow;
import com.ly.mobilelibrary.base.util.JsonResult;

public interface BorrowInfoService {
    //图书借阅
    public JsonResult addBorrowInfo(Borrow borrow);

    public JsonResult updateBorrowInfo(Borrow borrow);

    public JsonResult queryBorrowInfo(Borrow borrow);
}
