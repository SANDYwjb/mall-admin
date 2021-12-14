package com.beat.study.mall.admin.service.impl;

import com.beat.study.mall.admin.service.UmsMemberLevelService;
import com.beat.study.mall.mpg.mapper.UmsMemberLevelMapper;
import com.beat.study.mall.mpg.model.UmsMemberLevel;
import com.beat.study.mall.mpg.model.UmsMemberLevelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理Service实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
