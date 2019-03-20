package com.ly.mobilelibrary.modual.book.service;

import com.ly.mobilelibrary.base.util.JsonResult;

import com.ly.mobilelibrary.base.model.Book;

import java.util.List;
import java.util.Map;

public interface ManageBookService {
    public JsonResult addBook(Book book);

    public JsonResult deletBook(Book book);

    public JsonResult queryBooks(Book book);

    public JsonResult updateBook(Book book);

    public JsonResult queryBookClassInfo();

}
