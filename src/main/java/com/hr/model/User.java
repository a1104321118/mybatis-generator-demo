package com.hr.model;

import com.hr.base.BaseDO;
import java.util.Date;

public class User extends BaseDO {
    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private Date modify;

    /**
     * 
     * @return username 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return modify 
     */
    public Date getModify() {
        return modify;
    }

    /**
     * 
     * @param modify 
     */
    public void setModify(Date modify) {
        this.modify = modify;
    }
}