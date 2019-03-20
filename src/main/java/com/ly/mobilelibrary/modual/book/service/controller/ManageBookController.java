package com.ly.mobilelibrary.modual.book.service.controller;

import com.ly.mobilelibrary.base.mapper.ManageBookMapper;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.book.service.ManageBookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import com.ly.mobilelibrary.base.model.Book;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/3/16
 * Time: 10:46
 * Description: No Description
 */
@RestController("ManageBook")
public class ManageBookController {

    @Resource
    private ManageBookService manageBookService;

    @RequestMapping("addBook")
    public JsonResult addBook(Book book){
        manageBookService.addBook(book);
        return new JsonResult();
    }

    @RequestMapping("deletBook")
    public JsonResult deletBook(Book book){
        manageBookService.deletBook(book);
        return new JsonResult();
    }

    @RequestMapping("queryBooks")
    public JsonResult queryBooks(Book book){
        return manageBookService.queryBooks(book);
    }

    @RequestMapping("updateBook")
    public JsonResult updateBook(Book book){
        manageBookService.updateBook(book);
        return new JsonResult();
    }

    /**
     * 按照分类进行查询，并统计jie'y
     * @return
     */
    @RequestMapping("queryBookClassInfo")
    public JsonResult queryBookClassInfo(){
        return manageBookService.queryBookClassInfo();
    }

}
