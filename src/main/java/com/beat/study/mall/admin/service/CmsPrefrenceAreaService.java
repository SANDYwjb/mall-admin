package com.beat.study.mall.admin.service;


import com.beat.study.mall.mpg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区Service
 * Created by macro on 2018/6/1.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
