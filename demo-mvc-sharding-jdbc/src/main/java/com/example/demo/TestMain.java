package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.domain.SignPdf;
import com.example.demo.service.SignPdfService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author gxl
 * @date 2020/7/21 14:26
 * Explain: 测试
 */
public class TestMain {
    public static void main(String[] args) throws ParseException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SignPdfService signPdfService = applicationContext.getBean(SignPdfService.class);

        //添加数据
//        for (int i = 0; i < 50; i++) {
//            SignPdf signPdf = new SignPdf();
//            signPdf.setAppName("A" + i);
//            signPdf.setCreateTime(new Date());
//            signPdfService.save(signPdf);
//        }

        //查询数据
        String appName = "";
        String startTime = "";
        String endTime = "";
        Date startT = null;
        Date endT = null;
        Date time = null;
        //这里不设置时间将发生 找不到表的错误
        if (!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)) {
            try {
                startT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTime);
                endT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        } else {
             time = new Date();
        }
        List<SignPdf> list = signPdfService.queryAll(appName, startT, endT, new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time)));
        System.out.println(JSON.toJSONString(list));
    }
}
