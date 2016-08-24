/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.dal.object;

import java.util.Date;

/**
 * @FileName DataObject.java
 * @date Aug 22, 2016
 * @time 10:31:44 AM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p>
 * 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class DataObject {

    private long id;
    private long gmtCreate;
    private long gmtUpdate;
    private boolean isDeleted;

    public static final String idStr = "id";
    public static final String gmtCreateStr = "gmtCreate";
    public static final String gmtUpdateStr = "gmtUpdate";
    public static final String isDeletedStr = "isDeleted";
    
    @Override public String toString() {
        return "DataObject [id=" + id + ", gmtCreate=" + new Date(gmtCreate) + ", gmtUpdate=" + new Date(gmtUpdate)
               + ", isDeleted=" + isDeleted + "]";
    }

    protected void setDefaultInsertValue() {
        long now = (new Date()).getTime();
        this.id = 0;
        this.gmtCreate = now;
        this.gmtUpdate = now;
        this.isDeleted = false;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the gmtCreate
     */
    public long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate the gmtCreate to set
     */
    public void setGmtCreate(long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return the gmtUpdate
     */
    public long getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * @param gmtUpdate the gmtUpdate to set
     */
    public void setGmtUpdate(long gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * @return the isDeleted
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted the isDeleted to set
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
