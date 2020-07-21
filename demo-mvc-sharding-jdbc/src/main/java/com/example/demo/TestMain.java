package com.example.demo;

import com.example.demo.domain.SignPdf;
import com.example.demo.service.SignPdfService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author gxl
 * @date 2020/7/21 14:26
 * Explain: 测试
 */
public class TestMain {
    public static void main(String[] args) {
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
        List<SignPdf> list = signPdfService.queryAll(appName, startTime, endTime);
        System.out.println(list.size());
    }
}
