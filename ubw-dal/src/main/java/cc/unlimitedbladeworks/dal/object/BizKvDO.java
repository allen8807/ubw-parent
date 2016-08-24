/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.dal.object;

/**
 * @FileName BizKvDO.java
 * @date Aug 22, 2016
 * @time 10:20:14 AM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p>
 * 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class BizKvDO extends DataObject {

    private String key;
    private String valueStr;
    private long valueInt;

    public static final String keyStr = "key";
    public static final String valueStrStr = "valueStr";
     public static final String valueIntStr = "valueInt";

    @Override
    public String toString() {
        return "BizKvDO [" + super.toString()
                + ", key=" + key
                + ", valueStr=" + getValueStr()
                 + ", valueInt=" + getValueInt()
                + "]";
    }

    @Override
    public void setDefaultInsertValue() {
        super.setDefaultInsertValue();
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

   

    /**
     * @return the valueInt
     */
    public long getValueInt() {
        return valueInt;
    }

    /**
     * @param valueInt the valueInt to set
     */
    public void setValueInt(long valueInt) {
        this.valueInt = valueInt;
    }

    /**
     * @return the valueStr
     */
    public String getValueStr() {
        return valueStr;
    }

    /**
     * @param valueStr the valueStr to set
     */
    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }
}
