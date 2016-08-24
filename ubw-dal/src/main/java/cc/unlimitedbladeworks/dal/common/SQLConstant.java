/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.dal.common;

import java.util.Map;

/**
 * @FileName SQLConstant.java
 * @date Aug 22, 2016
 * @time 2:03:44 PM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p>
 * 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public final class SQLConstant {

    public static final String SQL_LIMIT_STR = "limit";

    public static final String SQL_LIMIT_SIZE_STR = "limit_size";

    public static final int SQL_LIMIT_ALL = -1;

    public static boolean addLimitStr(Map<String, Object> map, int begin, int size) {
        if (map == null) {
            return false;
        }
        if (size != SQLConstant.SQL_LIMIT_ALL) {
            if (size < 0 || begin < 0) {
                return false;
            } else {
                map.put(SQL_LIMIT_STR, begin);
                map.put(SQL_LIMIT_SIZE_STR, size);
            }
        }
        return true;
    }
}
