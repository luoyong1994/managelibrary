package com.ly.mobilelibrary.base.model;

public class Sysuser {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userPhone;

    private String userType;

    private String cardnumber;//'一卡通号'

    private String category;//0:专升本专升本,1:本科生,2:研究生,3:博士,4:研修生

    private String profession;

    private String userclass;//班级

    private String imagepath;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        cardnumber = cardnumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getUserclass() {
        return userclass;
    }

    public void setUserclass(String userclass) {
        this.userclass = userclass;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Override
    public String toString() {
        return "Sysuser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userType='" + userType + '\'' +
                ", cardnumber='" + cardnumber + '\'' +
                ", category='" + category + '\'' +
                ", profession='" + profession + '\'' +
                ", userclass='" + userclass + '\'' +
                ", imagepath='" + imagepath + '\'' +
                '}';
    }
}