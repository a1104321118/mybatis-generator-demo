package com.hr.dao;

import com.hr.model.User;

public interface UserMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(User record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(User record);
}