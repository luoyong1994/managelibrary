package com.ly.mobilelibrary.modual.base.service.serviceImpl;


import com.ly.mobilelibrary.base.mapper.SysuserMapper;
import com.ly.mobilelibrary.base.model.Sysuser;
import com.ly.mobilelibrary.base.util.ActionException;
import com.ly.mobilelibrary.modual.base.service.ManageBasicService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;

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
            sysuser.setUserPassword(DigestUtils.md5DigestAsHex(sysuser.getUserPassword().getBytes()));
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
        Sysuser lastSysuser = sysuserMapper.selectMaxUserId();
        if(null!=lastSysuser){
            sysuser.setUserId(lastSysuser.getUserId()+1);
        }else {
            sysuser.setUserId(1);
        }
        String pwd = DigestUtils.md5DigestAsHex(sysuser.getUserPassword().getBytes());
        sysuser.setUserPassword(pwd);
        sysuserMapper.add(sysuser);
    }

    @Override
    public List<Sysuser> queryAdmin() {
        return sysuserMapper.queryAdmin();
    }

    @Override
    public void deleteAdmin(Sysuser sysuser) {
        sysuserMapper.deleteAdmin(sysuser);
    }

    @Override
    public List<Sysuser> queryUser(Sysuser sysuser) {
        return sysuserMapper.queryUser(sysuser);
    }
}
