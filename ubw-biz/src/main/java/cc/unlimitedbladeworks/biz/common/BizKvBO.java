/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.unlimitedbladeworks.biz.common;

import cc.unlimitedbladeworks.dal.common.BizKvTags;
import cc.unlimitedbladeworks.dal.object.BizKvDO;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @FileName BizKvBO.java
 * @date Aug 23, 2016
 * @time 11:37:58 AM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p> 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public final class BizKvBO {
private static final Map<String,BizKvDO> bizKvMap = new ConcurrentHashMap<>();

    /**
     * @return the bizKvMap
     */
    public static Map<String,BizKvDO> getBizKvMap() {
        return bizKvMap;
    }

    /**
     * @param bizKvMapOrig
     * 
     */
      public  static void copyBizKvMap(Map<String,BizKvDO> bizKvMapOrig) {
         for (String key : BizKvTags.TAGS) { 
              bizKvMap.put(key, bizKvMapOrig.get(key));     
        }
    }

}
