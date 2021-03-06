package com.ly.mobilelibrary.base.util;

import com.ly.mobilelibrary.base.model.Sysuser;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/2/17
 * Time: 13:26
 * Description: No Description
 */
@ControllerAdvice
public class GlobalException extends Exception{

    /**
     * 全局异常处理类
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonResult globalExceptionHandler(HttpServletRequest request, Exception e){
        System.out.println(e.getMessage());
        JsonResult jsonResult = new JsonResult(e);
        System.out.println(jsonResult.toString());
        return jsonResult;
    }



}
