package com.ly.mobilelibrary.modual.base.service;


import com.ly.mobilelibrary.base.model.Sysuser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/2/17
 * Time: 12:38
 * Description: No Description
 */
public interface ManageBasicService {
    public Sysuser login(Sysuser sysuser);
    public void add(Sysuser sysuser);
    public List<Sysuser> queryAdmin();
    public void deleteAdmin(Sysuser sysuser);
    public List<Sysuser> queryUser(Sysuser sysuser);

}
