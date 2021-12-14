package com.beat.study.mall.admin.service.impl;

import com.beat.study.mall.admin.service.CmsPrefrenceAreaService;
import com.beat.study.mall.mpg.mapper.CmsPrefrenceAreaMapper;
import com.beat.study.mall.mpg.model.CmsPrefrenceArea;
import com.beat.study.mall.mpg.model.CmsPrefrenceAreaExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by macro on 2018/6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
