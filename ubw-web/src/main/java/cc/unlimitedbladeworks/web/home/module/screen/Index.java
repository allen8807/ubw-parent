/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.unlimitedbladeworks.web.home.module.screen;

import cc.unlimitedbladeworks.biz.admin.AdminManager;
import cc.unlimitedbladeworks.web.restricted.module.screen.TestError;
import com.alibaba.citrus.turbine.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @FileName Index.java
 * @date Aug 23, 2016
 * @time 8:27:34 PM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p> 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public class Index {
       private static final Logger logger = LoggerFactory.getLogger(Index.class);
    @Autowired
    AdminManager adminManager;
   
    public void execute(HttpServletResponse reponse, Context context,HttpServletRequest request) throws Exception {
        
       String str = "Welcome to Unlimited Blade Works!";
        adminManager.increaseIndexClick();
        long click = adminManager.getIndexClick();
        context.put("welcome", str);
        context.put("click", click);
        String ip = getIpAddr(request);
        context.put("ip",  ip);
        
        logger.info("No."+click +"visitor from IP "+ ip);
        
    //    reponse.getWriter().write(str);
    }
   
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
