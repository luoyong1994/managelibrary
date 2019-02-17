package com.ly.mobilelibrary.base.util;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/2/17
 * Time: 13:43
 * Description: No Description
 */
public class ActionException extends RuntimeException{
    /**
     * 异常编码
     */
    private Integer code;

    /**
     * 附加数据
     */
    private Object data;

    public ActionException(String errorMsg) {

        super(errorMsg);
    }

    public ActionException(String errorMsg, Integer code) {
        super(errorMsg);
        this.code = code;
    }

    public ActionException(Integer code, String errorMsg, Throwable errorCourse) {
        super(errorMsg,errorCourse);
        this.code = code;
    }

    public ActionException(String message, Integer code, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }
}
