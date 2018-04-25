package com.hr.dao;

import com.hr.model.Test;

public interface TestMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(Test record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(Test record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    Test selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(Test record);
}