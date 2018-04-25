package com.hr.model;

import com.hr.base.BaseDO;

public class UserInfo extends BaseDO {
    /**
     * user表的ID
     */
    private Integer userId;

    /**
     * 用户信息，测试用
     */
    private String userInfo;

    /**
     * user表的ID
     * @return user_id user表的ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * user表的ID
     * @param userId user表的ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户信息，测试用
     * @return user_info 用户信息，测试用
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * 用户信息，测试用
     * @param userInfo 用户信息，测试用
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }
}