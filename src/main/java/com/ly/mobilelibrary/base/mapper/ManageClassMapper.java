package com.ly.mobilelibrary.base.mapper;

import com.ly.mobilelibrary.base.model.Classify;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 管理分类
 */
@Repository
public interface ManageClassMapper {
    void addClass(Classify classify);
    void updateClass(Classify classify);
    void deleteClass(Classify classify);
    List<Classify> queryClass(Classify classify);
}
