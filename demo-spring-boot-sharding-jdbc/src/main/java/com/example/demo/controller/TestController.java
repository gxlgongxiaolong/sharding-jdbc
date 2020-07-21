package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.jpa.domain.SignPdf;
import com.example.demo.jpa.repository.SignPdfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author gxl
 * @date 2020/7/21 16:08
 * Explain:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private SignPdfRepository signPdfRepository;

    @RequestMapping("/save")
    private void save() {
        for (int i = 0; i < 50; i++) {
            SignPdf signPdf = new SignPdf();
            signPdf.setAppName("测试" + i);
            signPdf.setCreateTime(new Date());
            signPdfRepository.save(signPdf);
        }
    }

    @RequestMapping("/query")
    @ResponseBody
    private String query() {
        List<SignPdf> signPdfs = signPdfRepository.findAll();
        return JSON.toJSONString(signPdfs);
    }
}
