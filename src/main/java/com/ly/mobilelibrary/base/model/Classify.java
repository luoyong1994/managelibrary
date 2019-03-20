package com.ly.mobilelibrary.base.model;

public class Classify {
    private String id;
    private String name;
    private String classify;//分类类别
    private String bookid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classify='" + classify + '\'' +
                ", bookid='" + bookid + '\'' +
                '}';
    }
}
