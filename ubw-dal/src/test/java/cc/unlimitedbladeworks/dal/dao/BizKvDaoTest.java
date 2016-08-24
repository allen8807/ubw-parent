/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.dal.dao;

import cc.unlimitedbladeworks.dal.object.BizKvDO;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 *
 * @author Allen Zhao
 */
@ContextConfiguration(locations = {"classpath*:/spring/*.xml"})
public class BizKvDaoTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    BizKvDao bizKvDao;

    public BizKvDaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of queryAll method, of class BizKvDao.
     */
    @Test
    public void testQueryAll() {
        System.out.println("queryAll");
        Map<String, Object> map = new HashMap<>();

        List<BizKvDO> expResult = null;
        List<BizKvDO> result = bizKvDao.queryAll(map);
        System.out.println("queryAll size" + result.size());
        if (result.size() > 0) {
            System.out.println(result.get(0));
        }
    }

    /**
     * Test of insertItem method, of class BizKvDao.
     */
    @Test
    public void testInsertItem() {
        System.out.println("insertItem");
        BizKvDO bizKvDO = new BizKvDO();

        bizKvDO.setDefaultInsertValue();
        bizKvDO.setKey("test");
        bizKvDO.setValueInt(1);
        bizKvDO.setValueStr("test1");

        Integer expResult = null;
        Integer result = bizKvDao.insertItem(bizKvDO);
        //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of insertIgnoreItem method, of class BizKvDao.
     */
    @Test
    public void testInsertIgnoreItem() {
        System.out.println("insertIgnoreItem");
        BizKvDO bizKvDO = new BizKvDO();

        bizKvDO.setDefaultInsertValue();
        bizKvDO.setKey("test");
        bizKvDO.setValueInt(1);
        bizKvDO.setValueStr("test1");

        //   Integer expResult = null;
        Integer result = bizKvDao.insertIgnoreItem(bizKvDO);
        System.out.println();
        //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of updateItemByIdOrKey method, of class BizKvDao.
     */
    @Test
    public void testUpdateItemByIdOrKey() {
        System.out.println("updateItemByIdOrKey");
        Map<String, Object> map = new HashMap<>();
        map.clear();
        long now = new Date().getTime();
        map.put(BizKvDO.gmtUpdateStr, now);
        map.put(BizKvDO.keyStr, "click");
        map.put(BizKvDO.valueIntStr, 10);
        Integer expResult = null;
        Integer result = bizKvDao.updateItemByIdOrKey(map);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of addValueIntByIdOrKey method, of class BizKvDao.
     */
    @Test
    public void testAddValueIntByIdOrKey() {
        System.out.println("addValueIntByIdOrKey");
       Map<String, Object> map = new HashMap<>();
        map.clear();
        long now = new Date().getTime();
        map.put(BizKvDO.gmtUpdateStr, now);
        map.put(BizKvDO.keyStr, "click");
        map.put(BizKvDO.valueIntStr, 1);
        Integer expResult = null;
        Integer result = bizKvDao.addValueIntByIdOrKey(map);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

}
