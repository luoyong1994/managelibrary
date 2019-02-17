package com.ly.mobilelibrary.modual.base.service.serviceImpl;


import com.ly.mobilelibrary.base.mapper.SysuserMapper;
import com.ly.mobilelibrary.base.model.Sysuser;
import com.ly.mobilelibrary.base.util.ActionException;
import com.ly.mobilelibrary.modual.base.service.ManageBasicService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2019/2/17
 * Time: 12:40
 * Description: No Description
 */
@Service
public class ManageBasicServiceImpl implements ManageBasicService {
    @Resource
    public SysuserMapper sysuserMapper;

    @Override
    public Sysuser login(Sysuser sysuser) {
        Sysuser sysuser1 = sysuserMapper.querySysuser(sysuser);
        if (null != sysuser && null != sysuser1) {
            if (sysuser.getUserPassword().equals(sysuser1.getUserPassword())) {
                return sysuser1;
            } else {
                throw new ActionException("用户名错误或密码错误");
            }
        } else {
            throw new ActionException("用户名错误或密码错误");
        }
    }

    @Override
    public void add(Sysuser sysuser) {
        String pwd = DigestUtils.md5DigestAsHex(sysuser.getUserPassword().getBytes());
        sysuser.setUserPassword(pwd);
        sysuserMapper.add(sysuser);
    }
}
