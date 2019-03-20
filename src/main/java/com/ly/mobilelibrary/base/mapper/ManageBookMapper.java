package com.ly.mobilelibrary.base.mapper;

import com.ly.mobilelibrary.base.model.Book;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface ManageBookMapper {
    public void addBook(Book book);

    public void deletBook(Book book);

    public List<Book> queryBooks(Book book);

    public void updateBook(Book book);

    List<Map<String,String>>queryBookClassInfo();

}
