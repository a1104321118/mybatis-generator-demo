package com.hr.dao;

import com.hr.model.Zimu;

public interface ZimuMapper {
    /**
     *
     * @mbg.generated 2018-04-25
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insert(Zimu record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int insertSelective(Zimu record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    Zimu selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKeySelective(Zimu record);

    /**
     *
     * @mbg.generated 2018-04-25
     */
    int updateByPrimaryKey(Zimu record);
}