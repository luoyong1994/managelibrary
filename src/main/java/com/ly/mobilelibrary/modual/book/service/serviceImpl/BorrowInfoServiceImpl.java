package com.ly.mobilelibrary.modual.book.service.serviceImpl;

import com.ly.mobilelibrary.base.mapper.ManageBorrowInfoMapper;
import com.ly.mobilelibrary.base.model.Borrow;
import com.ly.mobilelibrary.base.util.JsonResult;
import com.ly.mobilelibrary.modual.book.service.BorrowInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorrowInfoServiceImpl implements BorrowInfoService {
    @Resource
    private ManageBorrowInfoMapper manageBorrowInfoMapper;

    @Override
    public JsonResult addBorrowInfo(Borrow borrow) {
        manageBorrowInfoMapper.addBorrowInfo(borrow);
        return new JsonResult();
    }

    @Override
    public JsonResult updateBorrowInfo(Borrow borrow) {
        manageBorrowInfoMapper.updateBorrowInfo(borrow);
        return new JsonResult();
    }

    @Override
    public JsonResult queryBorrowInfo(Borrow borrow) {
        List<Borrow> list=  manageBorrowInfoMapper.queryBorrowInfo(borrow);
        return new JsonResult(list);
    }
}
