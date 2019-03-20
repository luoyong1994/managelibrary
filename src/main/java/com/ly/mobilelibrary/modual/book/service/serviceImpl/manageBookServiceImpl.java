package com.ly.mobilelibrary.modual.book.service.serviceImpl;

import com.ly.mobilelibrary.base.mapper.ManageBookMapper;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.book.service.ManageBookService;
import org.springframework.stereotype.Service;
import com.ly.mobilelibrary.base.model.Book;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class manageBookServiceImpl implements ManageBookService {

    @Resource
    private ManageBookMapper manageBookMapper;

    @Override
    public JsonResult addBook(Book book) {
        manageBookMapper.addBook(book);
        return new JsonResult();
    }

    @Override
    public JsonResult deletBook(Book book) {
        manageBookMapper.deletBook(book);
        return new JsonResult();
    }

    @Override
    public JsonResult queryBooks(Book book) {
        List<Book> list = manageBookMapper.queryBooks(book);
        return new JsonResult(list);
    }

    @Override
    public JsonResult updateBook(Book book) {
        manageBookMapper.updateBook(book);
        return new JsonResult();
    }

    @Override
    public JsonResult queryBookClassInfo() {
        List<Map<String,String>> list = manageBookMapper.queryBookClassInfo();
        return new JsonResult(list);
    }
}
