package com.ly.mobilelibrary.modual.book.service.controller;

import com.ly.mobilelibrary.base.model.Classify;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.book.service.ManageClassifyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController("ManageClass")
public class ManageClassifyController {

    @Resource
    private ManageClassifyService manageClassifyService;

    @RequestMapping("addClass")
    public JsonResult addClass(Classify classify){
        manageClassifyService.addClass(classify);
        return new JsonResult();
    }

    @RequestMapping("updateClass")
    public JsonResult updateClass(Classify classify){
        manageClassifyService.updateClass(classify);
        return new JsonResult();
    }

    @RequestMapping("deleteClass")
    public JsonResult deleteClass(Classify classify){
        manageClassifyService.deleteClass(classify);
        return new JsonResult();
    }

    @RequestMapping("queryClass")
    public JsonResult queryClass(Classify classify){
        List<Classify> list = manageClassifyService.queryClass(classify);
        return new JsonResult(list);
    }




}
