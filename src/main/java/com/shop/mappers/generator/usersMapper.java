package com.shop.mappers.generator;

import com.shop.pojo.generator.users;

public interface usersMapper {
    int deleteByPrimaryKey(Integer idUser);

    int insert(users record);

    int insertSelective(users record);

    users selectByPrimaryKey(Integer idUser);

    int updateByPrimaryKeySelective(users record);

    int updateByPrimaryKey(users record);
}