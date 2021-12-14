package com.beat.study.mall.admin.service.impl;

import com.beat.study.mall.admin.service.OmsCompanyAddressService;
import com.beat.study.mall.mpg.mapper.OmsCompanyAddressMapper;
import com.beat.study.mall.mpg.model.OmsCompanyAddress;
import com.beat.study.mall.mpg.model.OmsCompanyAddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by macro on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
