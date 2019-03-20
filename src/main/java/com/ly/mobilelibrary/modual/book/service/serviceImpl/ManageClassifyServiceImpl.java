package com.ly.mobilelibrary.modual.book.service.serviceImpl;

import com.ly.mobilelibrary.base.mapper.ManageClassMapper;
import com.ly.mobilelibrary.base.model.Classify;
import com.ly.mobilelibrary.modual.book.service.ManageClassifyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManageClassifyServiceImpl implements ManageClassifyService {

    @Resource
    private ManageClassMapper manageClassMapper;

    @Override
    public void addClass(Classify classify) {
        manageClassMapper.addClass(classify);
    }

    @Override
    public void updateClass(Classify classify) {
        manageClassMapper.updateClass(classify);
    }

    @Override
    public void deleteClass(Classify classify) {
        manageClassMapper.deleteClass(classify);
    }

    @Override
    public List<Classify> queryClass(Classify classify) {
        List<Classify> list = manageClassMapper.queryClass(classify);
        return list;
    }
}
