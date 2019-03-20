package com.ly.mobilelibrary.base.model;

public class Borrow {

    private String id;
    private String bookId;
    private String userId;
    private String isOrder;
    private String orderDate;
    private String isBorrow;
    private String borrowBeginDate;
    private String borrowEndDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsOrder() {
        return isOrder;
    }

    public void setIsOrder(String isOrder) {
        this.isOrder = isOrder;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getIsBorrow() {
        return isBorrow;
    }

    public void setIsBorrow(String isBorrow) {
        this.isBorrow = isBorrow;
    }

    public String getBorrowBeginDate() {
        return borrowBeginDate;
    }

    public void setBorrowBeginDate(String borrowBeginDate) {
        this.borrowBeginDate = borrowBeginDate;
    }

    public String getBorrowEndDate() {
        return borrowEndDate;
    }

    public void setBorrowEndDate(String borrowEndDate) {
        this.borrowEndDate = borrowEndDate;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id='" + id + '\'' +
                ", bookId='" + bookId + '\'' +
                ", userId='" + userId + '\'' +
                ", isOrder='" + isOrder + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", isBorrow='" + isBorrow + '\'' +
                ", borrowBeginDate='" + borrowBeginDate + '\'' +
                ", borrowEndDate='" + borrowEndDate + '\'' +
                '}';
    }
}
