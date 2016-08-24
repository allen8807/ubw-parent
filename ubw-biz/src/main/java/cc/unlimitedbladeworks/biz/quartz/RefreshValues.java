/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.biz.quartz;

import cc.unlimitedbladeworks.biz.admin.AdminManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @FileName RefreshValues.java
 * @date Aug 23, 2016
 * @time 2:44:37 PM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p>
 * 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class RefreshValues {

    private final static Logger logger = LoggerFactory.getLogger(RefreshValues.class);
    @Autowired
    private AdminManager adminManager;

    // 定时任务配置,每隔1分钟跑一次(每分钟的10秒开始跑)，不会并行跑
    private static final String perMinuteCron = "10 * * * * ?";

    @Async
    @Scheduled(cron = perMinuteCron)
    public void doUpdateTypes() {
        logger.info("doRefreshValues");
        adminManager.refreshValues();
    }
}
