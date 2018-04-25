package com.hr.model;

import com.hr.base.BaseDO;

public class Test extends BaseDO {
    /**
     * 
     */
    private String name;

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}