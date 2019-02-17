package com.ly.mobilelibrary.modual.base.service.controller;



import com.ly.mobilelibrary.base.model.Sysuser;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.base.service.ManageBasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user/")
public class ManageBasicController {
    @Resource
    public ManageBasicService manageBasicService;

    @RequestMapping("login.do")
    public JsonResult login(Sysuser sysuser){
        Sysuser sysuser1 = manageBasicService.login(sysuser);
        JsonResult jsonResult = new JsonResult(sysuser1);
        return jsonResult;
    }

    @RequestMapping("register.do")
    public JsonResult register(Sysuser sysuser){
        manageBasicService.add(sysuser);
        return new JsonResult();
    }


}
