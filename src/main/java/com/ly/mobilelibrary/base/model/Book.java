package com.ly.mobilelibrary.base.model;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/3/16
 * Time: 11:06
 * Description: No Description
 */
public class Book {
    private  String id;
    private  String title;
    private  String author;
    private  String publish;
    private  String publishDate;
    private  String standardcode;
    private  String callnumber;//索书号
    private  String marc;
    private  String subTitle;//副题名
    private  String markbooknumber;//索书号
    private String  markbookname;//索书名
    private String borrownum;//外借次数
    private String classify;
    private String collectionNum;//收藏数

    public String getBorrownum() {
        return borrownum;
    }

    public void setBorrownum(String borrownum) {
        this.borrownum = borrownum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getStandardcode() {
        return standardcode;
    }

    public void setStandardcode(String standardcode) {
        this.standardcode = standardcode;
    }

    public String getCallnumber() {
        return callnumber;
    }

    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber;
    }

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getMarkbooknumber() {
        return markbooknumber;
    }

    public void setMarkbooknumber(String markbooknumber) {
        this.markbooknumber = markbooknumber;
    }

    public String getMarkbookname() {
        return markbookname;
    }

    public void setMarkbookname(String markbookname) {
        this.markbookname = markbookname;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(String collectionNum) {
        this.collectionNum = collectionNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", standardcode='" + standardcode + '\'' +
                ", callnumber='" + callnumber + '\'' +
                ", marc='" + marc + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", markbooknumber='" + markbooknumber + '\'' +
                ", markbookname='" + markbookname + '\'' +
                ", borrownum='" + borrownum + '\'' +
                ", classify='" + classify + '\'' +
                ", collectionNum='" + collectionNum + '\'' +
                '}';
    }
}
