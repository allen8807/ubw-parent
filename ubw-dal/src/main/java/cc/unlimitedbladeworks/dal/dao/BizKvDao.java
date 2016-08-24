/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.dal.dao;

import cc.unlimitedbladeworks.dal.object.BizKvDO;
import java.util.List;
import java.util.Map;

/**
 * @FileName BizKvDao.java
 * @date Aug 19, 2016
 * @time 4:50:13 PM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p>
 * 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public interface BizKvDao {

    List<BizKvDO> queryAll(Map<String, Object> map);

    Integer insertItem(BizKvDO bizKvDO);

    Integer insertIgnoreItem(BizKvDO bizKvDO);

    Integer updateItemByIdOrKey(Map<String, Object> map);
    
    Integer addValueIntByIdOrKey(Map<String, Object> map);

}
