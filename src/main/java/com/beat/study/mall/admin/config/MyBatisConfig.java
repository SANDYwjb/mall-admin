package com.beat.study.mall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration("admin-mybatisConfig")
@EnableTransactionManagement
@MapperScan({"com.beat.study.mall.mpg.mapper","com.beat.study.mall.admin.dao"})
public class MyBatisConfig {
}
