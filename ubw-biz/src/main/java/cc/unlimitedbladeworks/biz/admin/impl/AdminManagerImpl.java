/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.unlimitedbladeworks.biz.admin.impl;

import cc.unlimitedbladeworks.biz.admin.AdminManager;
import cc.unlimitedbladeworks.biz.common.BizKvBO;
import cc.unlimitedbladeworks.dal.common.BizKvTags;
import cc.unlimitedbladeworks.dal.dao.BizKvDao;
import cc.unlimitedbladeworks.dal.object.BizKvDO;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @FileName AdminManagerImpl.java
 * @date Aug 23, 2016
 * @time 9:35:20 AM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p> 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class AdminManagerImpl implements AdminManager{

    @Autowired
    BizKvDao bizKvDao;
    
    @Override
    public void init(){
        //初始化所有系统变量
        Map<String, Object> map = new HashMap<>();
        for (String key : BizKvTags.TAGS) {
            map.clear();
            map.put(BizKvDO.keyStr, key);
            List<BizKvDO> list =bizKvDao.queryAll(map);
            if(null==list || list.isEmpty()){
                BizKvDO bizKvDO = new BizKvDO();
                bizKvDO.setDefaultInsertValue();
                bizKvDO.setKey(key);
                bizKvDO.setValueInt(0);
                bizKvDao.insertItem(bizKvDO);
            }
        }
    }
    
    @Override
    public void refreshValues(){
        Map<String, Object> map = new HashMap<>();
        map.clear();  
        List<BizKvDO> list =bizKvDao.queryAll(map);
        Map<String, BizKvDO> mapKv = new HashMap<>();
        for(BizKvDO bizKvDO:list){
            mapKv.put(bizKvDO.getKey(), bizKvDO);
        }
        BizKvBO.copyBizKvMap(mapKv);
    }
    
    @Override
    public void increaseIndexClick(){
        Map<String, Object> map = new HashMap<>();
        map.clear();
        long now = new Date().getTime();
        map.put(BizKvDO.gmtUpdateStr, now);
        map.put(BizKvDO.keyStr, BizKvTags.index_click);
        map.put(BizKvDO.valueIntStr, 1);
        Integer result = bizKvDao.addValueIntByIdOrKey(map);
    }
    
        @Override
    public long getIndexClick(){
        Map<String, Object> map = new HashMap<>();
        map.clear();

        map.put(BizKvDO.keyStr, BizKvTags.index_click);

        List<BizKvDO> list =bizKvDao.queryAll(map);
        if(null!=list && !list.isEmpty()){
            return list.get(0).getValueInt();
        }else{
            return 0;
        }
    }
}
