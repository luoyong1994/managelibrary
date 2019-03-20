package com.ly.mobilelibrary.modual.book.service.controller;

import com.ly.mobilelibrary.base.mapper.ManageBorrowInfoMapper;
import com.ly.mobilelibrary.base.model.Borrow;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.book.service.BorrowInfoService;
import com.ly.mobilelibrary.modual.book.service.ManageBookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用于图书借阅、图书预约、超期提示
 */

@RestController
@RequestMapping("borrowInfo")
public class BorrowInfoController {

    @Resource
    private BorrowInfoService borrowInfoService;

    //图书借阅
    @RequestMapping("addBorrowInfo")
    public JsonResult addBorrowInfo(Borrow borrow){
        return borrowInfoService.addBorrowInfo(borrow);
    }

    @RequestMapping("updateBorrowInfo")
    public JsonResult updateBorrowInfo(Borrow borrow){
        return borrowInfoService.updateBorrowInfo(borrow);
    }

    @RequestMapping("queryBorrowInfo")
    public JsonResult queryBorrowInfo(Borrow borrow){
        return borrowInfoService.queryBorrowInfo(borrow);
    }
}
