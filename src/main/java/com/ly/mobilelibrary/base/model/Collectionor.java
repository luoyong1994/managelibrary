package com.ly.mobilelibrary.base.model;

public class Collectionor {
    private String id;
    private String bookid;
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Collectionor{" +
                "id='" + id + '\'' +
                ", bookid='" + bookid + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
