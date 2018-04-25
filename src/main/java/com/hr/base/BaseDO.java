package com.hr.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by huangrui on 2018/4/25.
 */
public class BaseDO implements Serializable{

    private Integer id;
    private Date created;
    private Date modified;
    private Integer flag;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
