package com.shop.mappers.generator;

import com.shop.pojo.generator.manager;

public interface managerMapper {
    int deleteByPrimaryKey(Integer idManager);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer idManager);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);
}