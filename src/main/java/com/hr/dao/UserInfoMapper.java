package com.hr.dao;

import com.hr.model.UserInfo;

public interface UserInfoMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(UserInfo record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(UserInfo record);
}