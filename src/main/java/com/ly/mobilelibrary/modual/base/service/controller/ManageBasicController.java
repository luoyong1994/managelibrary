package com.ly.mobilelibrary.modual.base.service.controller;



import com.ly.mobilelibrary.base.model.Sysuser;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.base.service.ManageBasicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user/")
public class ManageBasicController {
    @Resource
    public ManageBasicService manageBasicService;

    @RequestMapping(value="login.do",method = RequestMethod.POST)
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

    @RequestMapping("queryAdmin.do")
    public JsonResult queryAdmin(){
        List<Sysuser> list = manageBasicService.queryAdmin();
        return new JsonResult(list);
    }

    @RequestMapping("deleteAdmin.do")
    public JsonResult deleteAdmin(Sysuser sysuser){
        manageBasicService.deleteAdmin(sysuser);
        return new JsonResult();
    }

    @RequestMapping("addAdmin.do")
    public JsonResult addAdmin(Sysuser sysuser){
        manageBasicService.add(sysuser);
        return new JsonResult();
    }

    @RequestMapping("queryUser.do")
    public JsonResult queryUser(Sysuser sysuser){
        return new JsonResult(manageBasicService.queryUser(sysuser));
    }




}
