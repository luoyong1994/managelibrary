package com.ly.mobilelibrary.modual.book.service;

import com.ly.mobilelibrary.base.model.Classify;

import java.util.List;
import java.util.Map;

public interface ManageClassifyService {
    void addClass(Classify classify);
    void updateClass(Classify classify);
    void deleteClass(Classify classify);
    List<Classify> queryClass(Classify classify);

}
