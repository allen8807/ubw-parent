/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.unlimitedbladeworks.web.restricted.module.screen;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.Param;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * @FileName TestError.java
 * @date Mar 1, 2016
 * @time 4:31:28 PM
 * @author bolu.zhao
 * @Description 模块描述
 * @version 1.00 9999/99/99 类创建者姓名
 * <p> 9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * <p> 9.99 9999/99/99 修改者姓名 修改内容说明</p>
 * @see 参考类1
 * @see 参考类2
 */
public class TestError {

    private static final Logger logger = LoggerFactory.getLogger(TestError.class);

    @Autowired private HttpServletResponse response;

    public void execute(Context context, HttpServletRequest request, Navigator nav, @Param("code") String code)
            throws Exception {

        if (StringUtils.isBlank(code)) {
//            CommonUtils.sucess(response, request.getRemoteHost() + " : " + new Date().toString());
            return;
        }

        if (code.equals("500")) {
            throw new Exception("测试 500 ");
        }

        if (code.equals("4041")) {
            throw new com.alibaba.citrus.service.template.TemplateNotFoundException("测试 404 TemplateNotFoundException");
        }

        if (code.equals("4042")) {
            throw new com.alibaba.citrus.service.moduleloader.ModuleNotFoundException("测试 404 ModuleNotFoundException");
        }
        

//        CommonUtils.sucess(response, request.getRemoteHost() + " : " + new Date().toString());
        return;


    }
}
