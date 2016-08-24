/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.dal.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;

/**
 * @FileName TimeFormatter.java
 * @date Aug 22, 2016
 * @time 2:13:50 PM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p>
 * 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class TimeFormatter {

    private static Logger logger = LoggerFactory.getLogger(TimeFormatter.class);
    // SimpleDateFormat is not thread safe. Use ThreadLocal to fix it.
    //  private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
    // private static SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    private static ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM");
        }
    };

    private static ThreadLocal<SimpleDateFormat> dateFormatter = new ThreadLocal<SimpleDateFormat>() {

        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };

    public static String formatYearMonth(long timestamp) {
        try {
            return formatter.get().format(timestamp);
        } catch (Exception e) {
            logger.error("[formatYearMonth] occur exception, " + e);
        }
        return "";
    }

    public static String formatDate(long timestamp) {
        try {
            return dateFormatter.get().format(timestamp);
        } catch (Exception e) {
            logger.error("[formatDate] occur exception, " + e);
        }
        return "";
    }
}
