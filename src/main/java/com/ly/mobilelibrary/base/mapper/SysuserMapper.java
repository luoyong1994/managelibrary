package com.ly.mobilelibrary.base.mapper;

import com.ly.mobilelibrary.base.model.Sysuser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysuserMapper {
    public Sysuser querySysuser(Sysuser sysuser);
    public void add(Sysuser sysuser);
}