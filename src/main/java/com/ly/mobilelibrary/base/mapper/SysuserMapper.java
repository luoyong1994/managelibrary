package com.ly.mobilelibrary.base.mapper;

import com.ly.mobilelibrary.base.model.Sysuser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysuserMapper {
    public Sysuser querySysuser(Sysuser sysuser);
    public void add(Sysuser sysuser);
    public List<Sysuser> queryAdmin();
    public void deleteAdmin(Sysuser sysuser);
    public Sysuser selectMaxUserId();
    public List<Sysuser> queryUser(Sysuser sysuser);

}